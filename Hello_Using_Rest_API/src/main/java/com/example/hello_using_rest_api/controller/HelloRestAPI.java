package com.example.hello_using_rest_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/Hello", ""})
public class HelloRestAPI {
    @RequestMapping(value = {"", "/", "/home"})
    public String Controller() {
        return "Hello  from BridgeLabz";
    }
    //http://localhost:8080/query?name=paresh
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name)
    {
        return "Hello " + name + "!"+"How r u";
    }

    @GetMapping("/param/{name}")
    public String showHello(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }
}
