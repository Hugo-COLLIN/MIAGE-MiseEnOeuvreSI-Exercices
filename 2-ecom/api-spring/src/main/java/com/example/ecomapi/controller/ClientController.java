package com.example.ecomapi.controller;

import com.example.ecomapi.model.Client;
import com.example.ecomapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable("id") final Long id) {
        Optional<Client> client = clientService.getClient(id);
        if (client.isPresent()) {
            return client.get();
        } else {
            return null;
        }
    }
    @GetMapping("/clients")
    public Iterable<Client> getClients() {
        return clientService.getClients();
    }
}
