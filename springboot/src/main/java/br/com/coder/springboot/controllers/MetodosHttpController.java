package br.com.coder.springboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "Metodo GET";
    }

    @PostMapping
    public String post(){
        return "Metodo POST";
    }

    @PutMapping
    public String put(){
        return "Metodo PUT";
    }

    @PatchMapping
    public String patch(){
        return "Metodo PATCH";
    }

    @DeleteMapping
    public String delete(){
        return "Metodo DELETE";
    }
}
