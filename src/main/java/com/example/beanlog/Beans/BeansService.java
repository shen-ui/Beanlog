package com.example.beanlog.Beans;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
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
