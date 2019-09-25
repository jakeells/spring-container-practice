package com.example.springcontainterpractice.source;

import com.example.springcontainterpractice.interfaces.Employment;
import com.example.springcontainterpractice.interfaces.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("applicationData.properties")
public class ApplicationConfiguration {

    @Bean
    public Employment fullTimeEmployment() {
        return new FullTime();
    }

    @Bean
    public CollegeStudent partTimeStudent() {
        return new CollegeStudent(fullTimeEmployment());
    }

    @Bean
    public Person collegePerson() {
        return new CollegeStudent(fullTimeEmployment());
    }
}
