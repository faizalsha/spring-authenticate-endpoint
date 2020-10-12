package com.example.springauthenticateendpoint.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

public class LabRecord {
    private String testId;

    private String test_name;
    private String physicianId;
    private String patientId;
    private String tests;
    private String testResults;
    private Date date;
    private Time time;


    public LabRecord() {
    }


    public LabRecord(String testId, String test_name, String physicianId, String patientId, String tests,
                     String testResults, Date date, Time time) {
        super();
        this.testId = testId;
        this.test_name = test_name;
        this.physicianId = physicianId;
        this.patientId = patientId;
        this.tests = tests;
        this.testResults = testResults;
        this.date = date;
        this.time = time;
    }


    public String getTestId() {
        return testId;
    }


    public void setTestId(String testId) {
        this.testId = testId;
    }


    public String getTest_name() {
        return test_name;
    }


    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }


    public String getPhysicianId() {
        return physicianId;
    }


    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }


    public String getPatientId() {
        return patientId;
    }


    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }


    public String getTests() {
        return tests;
    }


    public void setTests(String tests) {
        this.tests = tests;
    }


    public String getTestResults() {
        return testResults;
    }


    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public Time getTime() {
        return time;
    }


    public void setTime(Time time) {
        this.time = time;
    }




}
