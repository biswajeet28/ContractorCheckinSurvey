package com.verion.checkinsurvey.ContractorCheckinSurveyService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/application")
public class AppController {

    @RequestMapping(path = "/getSampleResponse", method = RequestMethod.GET)
    public String healthCheck(){
        return "Sample Response";
    }

}
