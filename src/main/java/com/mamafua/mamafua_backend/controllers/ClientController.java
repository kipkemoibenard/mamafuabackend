package com.mamafua.mamafua_backend.controllers;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.LoginRequest;
import com.mamafua.mamafua_backend.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return null;
    }

    @GetMapping("/allClients")
    public List<Client>getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginClient(@RequestBody LoginRequest loginRequest) {
        Client client = clientService.loginClient(loginRequest.getEmail(), loginRequest.getPassword());
        if (client != null) {
//            return ResponseEntity.ok("Login successful");
            return null;
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
