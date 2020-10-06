package com.example.springauthenticateendpoint.controller;

import com.example.springauthenticateendpoint.model.Appointment;
import com.example.springauthenticateendpoint.model.Availability;
import com.example.springauthenticateendpoint.model.GenericResponse;


import com.example.springauthenticateendpoint.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    /*sample request dont delete*/
    @RequestMapping("/hello")
    public GenericResponse foo(){
        GenericResponse response = appointmentService.getResponse();
        response.setMessage("added load balanced");
        return response;
    }
    @RequestMapping(value = "/set-appointment", method = RequestMethod.POST)
    public GenericResponse setAppointment(@RequestBody Appointment appointment){
        return appointmentService.setAppointment(appointment);
    }
    @RequestMapping("/get-appointment/{physicianId}")
    public GenericResponse getAppointmentByPhysicianId(@PathVariable String physicianId){
        return appointmentService.getAppointmentByPhysicianId(physicianId);
    }
    @RequestMapping("/get-all-appointment")
    public GenericResponse getAllAppointment(){
        return appointmentService.getAllAppointment();
    }

    /*some more api need to be define here */
}
