package com.elysium.controller;

import com.elysium.model.Elysium;
import com.elysium.model.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elysium")
public class ElysiumController {

    @GetMapping("/message")
    public HelloWorld getMessageR() {
        return new HelloWorld("Hello World from Elysium");
    }

    @GetMapping("/elmessage")
    public Elysium getElysiumMessage() {
        return new Elysium("Elysium is awesome");
    }

}
