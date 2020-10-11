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

    @RequestMapping(value = "update-record", method = RequestMethod.POST)
    public GenericResponse updateRecord(@RequestBody TreatmentHistory record){
        GenericResponse response = historyService.updateRecord(record);
        return (response != null) ? response : new GenericResponse(0, "some error occurred", null);
    }

    @RequestMapping("get-history-by-id/{recordId}")
    public GenericResponse getRecordById(@PathVariable String recordId){
        return historyService.getSingleRecordById(recordId);
    }
}
