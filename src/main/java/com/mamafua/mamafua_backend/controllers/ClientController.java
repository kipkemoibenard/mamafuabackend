package com.mamafua.mamafua_backend.controllers;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
@CrossOrigin(origins = "*")
public class ClientController {
    private final ClientService clientService;

    public  ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("register")
    public String registerClient(@RequestBody Client client) {
        clientService.registerClient(client);
        return "Client registered";
    }

    @GetMapping("/allClients")
    public List<Client>getAllClients(){
        return clientService.getAllClients();
    }
}
