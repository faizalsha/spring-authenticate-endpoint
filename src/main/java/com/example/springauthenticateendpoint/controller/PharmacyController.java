package com.example.springauthenticateendpoint.controller;


import com.example.springauthenticateendpoint.model.GenericResponse;
import com.example.springauthenticateendpoint.model.PharmacyCurrentRecord;
import com.example.springauthenticateendpoint.model.PharmacyHistory;
import com.example.springauthenticateendpoint.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    @Autowired
    private PharmacyService service;

    @RequestMapping("/get-all-records")
    public GenericResponse getAllRecords(){
        return service.getAllRecords();
    }

    @RequestMapping("/delete-record/{id}")
    public GenericResponse deleteRecord(@PathVariable String id){
        return service.deleteActiveRecordById(id);
    }

    @RequestMapping(value = "/insert-record", method = RequestMethod.POST)
    public GenericResponse insertRecord(@RequestBody PharmacyCurrentRecord record){
        return service.addRecord(record);
    }

    @RequestMapping("/history/get-all-history")
    public GenericResponse getAllHistory(){
        return service.getAllHistory();
    }

    @RequestMapping(value = "/history/insert-history", method = RequestMethod.POST)
    public GenericResponse insertHistory(@RequestBody PharmacyHistory history){
        return service.insertHistory(history);
    }
}
