package com.ishanrtripathi.sampleEnterprise.service;

import com.ishanrtripathi.sampleEnterprise.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Data data;

    public String getIndexValue() {
        return data.getIndexData();
    }
    public String setIndexValue(String info){
        data.setIndexData(info);
        return getIndexValue();
    }
}
