package com.example.springcontainterpractice.application;

import com.example.springcontainterpractice.interfaces.Employment;
import com.example.springcontainterpractice.interfaces.Person;
import com.example.springcontainterpractice.source.ApplicationConfiguration;
import com.example.springcontainterpractice.source.CollegeStudent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringContainterPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringContainterPracticeApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
/*
        Person collegePerson = context.getBean("collegePerson", Person.class);
        System.out.println("Name: " + collegePerson.getFirstName() + " " + collegePerson.getLastName() + "\nAge: " + collegePerson.getAge());
        Employment fullTime = context.getBean("fullTimeEmployment", Employment.class);
        System.out.println("Employer: " + fullTime.getEmployer() + "\nEmployment Type: " + fullTime.getEmploymentType() + "\nHours: " + fullTime.getBaseHours());
*/
        CollegeStudent partTimeStudent = context.getBean("partTimeStudent", CollegeStudent.class);
        System.out.println("\nName: " + partTimeStudent.getFirstName() + " " + partTimeStudent.getLastName() + "\nAge: " + partTimeStudent.getAge()
         + "\nEmployer: " + partTimeStudent.getEmployer() + "\nEmployment Type: " + partTimeStudent.getHours());
    }
}
