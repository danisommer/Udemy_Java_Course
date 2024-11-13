package com.course.springboot.controllers;

import com.course.springboot.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping(path="/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Daniel", "987.654.321-00");
    }

    @GetMapping()
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Daniel", "987.654.321-00");
    }
}
