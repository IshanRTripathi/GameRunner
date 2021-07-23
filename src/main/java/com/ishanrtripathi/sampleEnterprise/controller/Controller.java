package com.ishanrtripathi.sampleEnterprise.controller;

import com.ishanrtripathi.sampleEnterprise.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class Controller {

    @Autowired
    Service service;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String index(){
        return service.getIndexValue();
    }


    @RequestMapping(name = "/add/{info}", method = RequestMethod.POST)
    public String indexPost(@PathVariable("info") String info ){
        return service.setIndexValue(info);
    }
}
