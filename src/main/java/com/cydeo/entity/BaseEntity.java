package com.cydeo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    //This information are not needed in the UI, but it's needed in the DB for tracking the data
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean isDeleted = false;

    @Column(nullable = false, updatable = false)
    private LocalDateTime insertDateTime;
    @Column(nullable = false, updatable = false)
    private Long insertUserId;
    @Column(nullable = false)
    private LocalDateTime lastUpdateDateTime;
    @Column(nullable = false)
    private Long lastUpdateUserId;

    @PrePersist//Ensure that entities are correctly initialized and validated before being stored in the database
    private void onPrePersist() {//to initialize data
        this.insertDateTime = LocalDateTime.now();
        this.lastUpdateDateTime = LocalDateTime.now();
        this.insertUserId = 1L;
        this.lastUpdateUserId = 1L;
    }

    @PreUpdate
//Ensure that any necessary modifications or validations are applied to an entity right before it is updated in the database
    private void onPreUpdate() {
        this.lastUpdateDateTime = LocalDateTime.now();
        this.lastUpdateUserId = 1L;
    }
}
