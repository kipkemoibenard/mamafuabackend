package com.mamafua.mamafua_backend.controllers;


import com.mamafua.mamafua_backend.dtos.ClientRequestDto;
import com.mamafua.mamafua_backend.dtos.RequestServiceDto;
import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.RequestedServices;
import com.mamafua.mamafua_backend.repo.ClientDao;
import com.mamafua.mamafua_backend.repo.RequestedServicesDAO;
import com.mamafua.mamafua_backend.services.RequestedSvcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("request")
@CrossOrigin(origins = "*")
public class RequestedServiceController {

    private final RequestedSvcService requestedSvcService;
    private final RequestedServicesDAO requestedServicesDAO;

    private final ClientDao clientDao;

    public RequestedServiceController(RequestedSvcService requestedSvcService, RequestedServicesDAO requestedServicesDAO, ClientDao clientDao){
        this.requestedSvcService = requestedSvcService;
        this.requestedServicesDAO = requestedServicesDAO;
        this.clientDao = clientDao;
    }

    @PostMapping("/save-req-service")
    public ResponseEntity<Client> saveReqService(@RequestBody ClientRequestDto clientRequestDto) {
        Client client = new Client();
        client.setEmail(clientRequestDto.getReqPerson());

        List<RequestedServices> reqServices = new ArrayList<>();
        for (RequestServiceDto requestServiceDto : clientRequestDto.getRequests()) {
            RequestedServices requestedServices = new RequestedServices();

            requestedServices.setReqName(requestServiceDto.getReqName());
            requestedServices.setReqCost(requestServiceDto.getReqCost());
            requestedServices.setRequestStatus(requestServiceDto.getRequestStatus());
            requestedServices.setClient(client);

            reqServices.add(requestedServices);
        }
        client.setReqServices(reqServices);

        clientDao.save(client);

        return ResponseEntity.ok(client);
    }

}
