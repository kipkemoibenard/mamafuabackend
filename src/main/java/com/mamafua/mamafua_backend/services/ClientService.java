package com.mamafua.mamafua_backend.services;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.repo.ClientDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public String registerClient(Client client) {
        clientDao.save(client);
        return  "client registered";
    }

    public List<Client>getAllClients(){
        return clientDao.findAll();
    }
}
