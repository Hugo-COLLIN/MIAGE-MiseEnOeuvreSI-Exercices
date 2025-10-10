package com.example.webapp.repository;

import com.example.webapp.configuration.CustomProperties;
import com.example.webapp.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientProxy {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(
            ClientProxy.class);
    @Autowired
    private CustomProperties props;
    public Iterable<Client> getClients() {
        String baseApiUrl = props.getApiUrl();
        String getClientsUrl = baseApiUrl + "/clients";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<Client>> response = restTemplate.exchange(
                getClientsUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<Client>>() {}
        );
        log.debug("Get Clients call " + response.getStatusCode().toString());
        return response.getBody();
    }
    public Client getClient(int id) {
        String baseApiUrl = props.getApiUrl();
        String getClientUrl = baseApiUrl + "/client/" + id;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Client> response = restTemplate.exchange(
                getClientUrl,
                HttpMethod.GET,
                null,
                Client.class
        );
        log.debug("Get Client call " + response.getStatusCode().toString());
        return response.getBody();
    }

    public Client saveClient(Client client) {
        String baseApiUrl = props.getApiUrl();
        String createClientUrl = baseApiUrl + "/clients";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Client> response = restTemplate.postForEntity(
                createClientUrl,
                client,
                Client.class
        );

        log.debug("Save Client call " + response.getStatusCode().toString());
        return response.getBody();
    }

}
