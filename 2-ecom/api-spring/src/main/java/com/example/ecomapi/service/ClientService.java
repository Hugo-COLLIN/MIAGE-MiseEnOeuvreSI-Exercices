package com.example.ecomapi.service;

import com.example.ecomapi.model.Client;
import com.example.ecomapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public Optional<Client> getClient(final Long id) {
        return clientRepository.findById(id);
    }
    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }
    public void deleteClient(final Long id) {
        clientRepository.deleteById(id);
    }
    public Client saveClient(Client client) {
        Client savedClient = clientRepository.save(client);
        return savedClient;
    }
}
