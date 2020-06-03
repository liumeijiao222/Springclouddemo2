package com.example.consumerserver.controller;

import com.example.consumerserver.service.Helloservice;

import com.example.consumerserver.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    /* @Autowired
     Helloservice helloService;
     @RequestMapping(value = "/hi")
     public String hi(@RequestParam String name)
     {
         return helloService.hiService(name);

     }

  */
    @Autowired
    private TestInterface testInterface;

    @GetMapping("/")
    public String test() {
        return testInterface.test();
    }
}
