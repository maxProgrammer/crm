package com.api.crm.apicrm.controllers;

import com.api.crm.apicrm.models.ClienteModel;
import com.api.crm.apicrm.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteModel> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteModel adicionar(@RequestBody ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

}
