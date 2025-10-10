package com.example.webapp.service;

import com.example.webapp.model.Client;
import com.example.webapp.repository.ClientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientProxy clientProxy;
    public Client getClient(final int id) {
        return clientProxy.getClient(id);
    }
    public Iterable<Client> getClients() {
        return clientProxy.getClients();
    }
    public Client saveClient(Client client) {
        return clientProxy.saveClient(client);
    }

}
