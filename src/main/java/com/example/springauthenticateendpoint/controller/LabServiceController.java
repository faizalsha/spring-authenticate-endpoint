package com.example.springauthenticateendpoint.controller;


import com.example.springauthenticateendpoint.model.GenericResponse;
import com.example.springauthenticateendpoint.model.LabRecord;
import com.example.springauthenticateendpoint.model.LabRecordPast;
import com.example.springauthenticateendpoint.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab")
public class LabServiceController {

    @Autowired
    private LabService service;

    @RequestMapping("/get-all-records")
    public GenericResponse getAllRecords(){
        return new GenericResponse(1, "success", service.getAllLabRecords());
    }

    @RequestMapping(value = "/add-lab-records", method = RequestMethod.POST)
    public GenericResponse addLabRecord(@RequestBody LabRecord record){
        return new GenericResponse(1, "success", service.addLabRecord(record));
    }

    @RequestMapping("/get-all-history")
    public GenericResponse getAllHistory(){
        return service.getAllLabHistory();
    }

    @RequestMapping(value = "/add-history", method = RequestMethod.POST)
    public GenericResponse addHistory(@RequestBody LabRecordPast history){
        return service.addLabHistory(history);
    }
}
