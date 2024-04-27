package com.mamafua.mamafua_backend.services;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.MamaFua;
import com.mamafua.mamafua_backend.repo.ClientDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public String registerClient(Client client) {
//        clientDao.save(client);
//        return  "client registered";
        Optional<Client> existingClient = clientDao.findByEmail(client.getEmail());

        if (existingClient.isPresent()) {
            // Email already exists, display message
            return "Email already registered!";
        } else {
            // Email doesn't exist, proceed with registration
            clientDao.save(client);
            return "Registration successful!";
        }
    }

    public List<Client>getAllClients(){
        return clientDao.findAll();
    }

    public Client loginClient(String email, String password) {
        return clientDao.findByEmailAndPassword(email, password);
    }
}
