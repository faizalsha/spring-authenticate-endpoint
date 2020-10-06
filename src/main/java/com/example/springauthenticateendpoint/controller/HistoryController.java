package com.example.springauthenticateendpoint.controller;

import com.example.springauthenticateendpoint.model.GenericResponse;
import com.example.springauthenticateendpoint.model.TreatmentHistory;
import com.example.springauthenticateendpoint.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/get-all-records-by-patient-id/{patientId}")
    public GenericResponse getAllRecordsByPatientId(@PathVariable String patientId){
        return historyService.getAllRecordsByPatientId(patientId);
    }

    @RequestMapping("/get-all-records-by-physician-id/{physicianId}")
    public GenericResponse getAllRecordsByPhysicianId(@PathVariable String physicianId){
        return historyService.getAllRecordsByPhysicianId(physicianId);
    }
    @RequestMapping(value = "insert-history", method = RequestMethod.POST)
    public GenericResponse insertHistory(@RequestBody TreatmentHistory history){
        return historyService.insertHistory(history);
    }
}
