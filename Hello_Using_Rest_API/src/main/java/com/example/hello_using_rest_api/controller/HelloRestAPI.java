package com.example.hello_using_rest_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/Hello", ""})
public class HelloRestAPI {
    @RequestMapping(value = {"", "/", "/home"})
    public String Controller() {
        return "Hello  from BridgeLabz";
    }
}