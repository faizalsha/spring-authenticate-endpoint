package com.example.springauthenticateendpoint.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;


public class PharmacyCurrentRecord {

    private String id;
    private String patientId;
    private String physicianId;
    private String prescription;
    private Date date;
    private Time time;

    public PharmacyCurrentRecord() {
    }

    public PharmacyCurrentRecord(String id, String patientId, String physicianId, String prescription, Date date, Time time) {
        this.id = id;
        this.patientId = patientId;
        this.physicianId = physicianId;
        this.prescription = prescription;
        this.date = date;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
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