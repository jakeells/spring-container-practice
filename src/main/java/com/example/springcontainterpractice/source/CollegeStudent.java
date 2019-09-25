package com.example.springcontainterpractice.source;

import com.example.springcontainterpractice.interfaces.Employment;
import com.example.springcontainterpractice.interfaces.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class CollegeStudent implements Person {

    private Employment employment;

    @Value("${person.data.firstName}")
    private String firstName;
    @Value("${person.data.lastName}")
    private String lastName;
    @Value("${person.data.age}")
    private String age;

    @Autowired
    public CollegeStudent(Employment employment) {
        this.employment = employment;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    public String getEmployer() {
        return this.employment.getEmployer();
    }

    public String getHours() {
        return this.employment.getBaseHours();
    }


    public String getType() {
        return this.employment.getEmploymentType();
    }
}
