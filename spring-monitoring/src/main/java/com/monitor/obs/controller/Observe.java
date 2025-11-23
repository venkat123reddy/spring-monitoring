package com.monitor.obs.controller;

import com.monitor.obs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/observe")
@Slf4j
public class Observe {

    private final UserService userService;

    public Observe(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    public String observe() {
        log.info("ObserverController");
        userService.addUser();
        return "observe";
    }


}
