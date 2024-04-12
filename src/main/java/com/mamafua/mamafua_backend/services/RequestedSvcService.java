package com.mamafua.mamafua_backend.services;


import com.mamafua.mamafua_backend.entities.RequestedServices;
import com.mamafua.mamafua_backend.repo.RequestedServicesDAO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RequestedSvcService {
    private final RequestedServicesDAO requestedServicesDAO;

    public RequestedSvcService(RequestedServicesDAO requestedServicesDAO){
        this.requestedServicesDAO = requestedServicesDAO;
    }

    public String saveRequestedService(RequestedServices requestedServices) {
        requestedServicesDAO.save(requestedServices);
        return null;
    }
}
