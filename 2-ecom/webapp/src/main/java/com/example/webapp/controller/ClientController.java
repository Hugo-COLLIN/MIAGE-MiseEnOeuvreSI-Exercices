package com.example.webapp.controller;

import org.springframework.ui.Model;
import com.example.webapp.model.Client;
import com.example.webapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping("/")
    public String home(Model model) {
        Iterable<Client> listClient = service.getClients();
        model.addAttribute("clients", listClient);
        return "home";
    }
    @GetMapping("/createClient")
    public String createClient(Model model) {
        Client e = new Client();
        model.addAttribute("client", e);
        return "formNewClient";
    }
    @PostMapping("/saveClient")
    public ModelAndView saveClient(@ModelAttribute Client client) {
        if(client.getId() != null) {
// Client from update form has the password field not filled,
// so we fill it with the current password.
            Client current = service.getClient(client.getId());
            client.setPassword(current.getPassword());
        }
        service.saveClient(client);
        return new ModelAndView("redirect:/");
    }
}
