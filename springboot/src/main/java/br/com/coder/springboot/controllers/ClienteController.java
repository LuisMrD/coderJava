package br.com.coder.springboot.controllers;

import br.com.coder.springboot.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente getCliente(){
        return new Cliente(28, "Luis", "35376768830");
    }

    @GetMapping(path = "/{id}")
    public Cliente newClienteId1(@PathVariable int id){
        return new Cliente(id, "Felipe", "35376768830");
    }

    @GetMapping
    public Cliente newClienteId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "Luis Oliveira", "35376768830");
    }

}
