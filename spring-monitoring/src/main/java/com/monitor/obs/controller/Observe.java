package com.monitor.obs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/observe")
public class Observe {


    @GetMapping
    @ResponseBody
    public String observe() {
        return "observe";
    }


}
