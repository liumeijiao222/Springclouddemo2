package com.example.consumerserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product")
public interface TestInterface {

    @RequestMapping(value = "/")
    String test();

}