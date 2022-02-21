package br.com.coder.springboot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = "/ola")
    public String olaSpring() {
        return "Ola Springboot";
    }


}
