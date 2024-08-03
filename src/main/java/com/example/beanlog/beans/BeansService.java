package com.example.beanlog.beans;

import java.util.List;

public class BeansService {
    public List<Beans> getBeans(){
        String[] a = {"grass", "straw"};
        return(List.of(
                new Beans(
                        "brand",
                        "name",
                        "roast_level",
                        "origin",
                        a,
                        14.99
                )
        ));
    }
}
