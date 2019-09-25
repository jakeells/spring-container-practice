package com.example.springcontainterpractice.source;

import com.example.springcontainterpractice.interfaces.Employment;
import org.springframework.beans.factory.annotation.Value;

public class FullTime implements Employment {

    @Value("${employment.data.employer}")
    private String employer;
    @Value("${employment.data.baseHours}")
    private String baseHours;
    @Value("${employment.data.type}")
    private String type;

    @Override
    public String getEmployer() {
        return this.employer;
    }

    @Override
    public String getBaseHours() {
        return this.baseHours;
    }

    @Override
    public String getEmploymentType() {
        return this.type;
    }
}
