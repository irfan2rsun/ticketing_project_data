package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;

@SpringBootApplication //this includes @Configuration
public class TicketingProjectDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectDataApplication.class, args);
    }

    //ModelMapper mapper = new Model(); tightly couple not a good practice
    //I am trying to add bean in the container through @Bean annotation as ModelMapper is not my class
    //Create a class annotated with @Configuration // these are covered by @SpringBootApplication
    //Write a method which return obj that I try to add in the container
    //Annotate this method with @Bean
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }


}
