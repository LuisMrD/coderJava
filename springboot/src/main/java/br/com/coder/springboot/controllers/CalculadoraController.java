package br.com.coder.springboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calc")
public class CalculadoraController {

    @GetMapping(path = "/soma/{n1}/{n2}")
    public int soma(@PathVariable int n1, @PathVariable int n2){
        return n1 + n2;
    }

    @GetMapping(path = "/sub")
    public int sub(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2 ){
        return n1 - n2;
    }
}
