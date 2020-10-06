package com.example.springauthenticateendpoint.service;

import com.example.springauthenticateendpoint.model.GenericResponse;
import com.example.springauthenticateendpoint.model.TreatmentHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class HistoryService {
    @Autowired
    private RestTemplate restTemplate;
    final String BASE_URL = "http://treatment-history-service/history/";

    public GenericResponse getAllRecordsByPatientId(String patientId){
        return restTemplate.getForObject(BASE_URL + "patient/" + patientId, GenericResponse.class);
    }

    public GenericResponse getAllRecordsByPhysicianId(String physicianId){
        return restTemplate.getForObject(BASE_URL + "physician/" + physicianId, GenericResponse.class);
    }


    public GenericResponse insertHistory(TreatmentHistory history){
        return restTemplate.postForObject(BASE_URL + "insert-history", history, GenericResponse.class);
    }
}
