package com.ishanrtripathi.sampleEnterprise.data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class Data {
    List<String> list= List.of("mota","ishan", "prachi", "ayush", "rishu", "yishu", "himanshu", "sweets");
    public String getIndexData() {
        return list.get((int)(Math.random()*100)%list.size());
    }

    public void setIndexData(String info){
        list.add(info);
    }
}
