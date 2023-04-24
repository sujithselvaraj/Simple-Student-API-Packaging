package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
           Student sujith= new Student(
                   "Sujith",
                   "sujith@gmail.com",
                   LocalDate.of(2003, Month.APRIL,30)
            );

            Student nisanth= new Student(
                    "Nisanth",
                    "nisanth@gmail.com",
                    LocalDate.of(2004, Month.OCTOBER,23)

            );

            repository.saveAll(
                    List.of(sujith,nisanth)
            );

        };
    }
}
