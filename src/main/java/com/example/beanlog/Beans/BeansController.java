package com.example.beanlog.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "api/v1/beans", method = RequestMethod.GET)
public class BeansController {
    private final BeansService beansService;
    @Autowired
    public BeansController(BeansService beansService) {
        this.beansService = beansService;
    }
}
