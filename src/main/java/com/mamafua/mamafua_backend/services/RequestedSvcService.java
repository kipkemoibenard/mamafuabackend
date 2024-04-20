package com.mamafua.mamafua_backend.services;


import com.mamafua.mamafua_backend.dtos.RequestNameAndCostDto;
import com.mamafua.mamafua_backend.dtos.RequestServiceDto;
import com.mamafua.mamafua_backend.entities.RequestedServices;
import com.mamafua.mamafua_backend.repo.RequestedServicesDAO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;

@Service
public class RequestedSvcService {
    private final RequestedServicesDAO requestedServicesDAO;

    public RequestedSvcService(RequestedServicesDAO requestedServicesDAO){
        this.requestedServicesDAO = requestedServicesDAO;
    }

//    public String saveRequestedService(RequestedServices requestedServices) {
//        requestedServicesDAO.save(requestedServices);
//        return null;
//    }

    public String saveRequestedService(RequestServiceDto requestServiceDto) {
        for (RequestNameAndCostDto requestData : requestServiceDto.getRequests()) {
            RequestedServices requestedServices = new RequestedServices();
            requestedServices.setSvcName(requestData.getSvcName());
            requestedServices.setSvcCost(requestData.getSvcCost());
            requestedServices.setTotalCost(requestServiceDto.getTotalCost());
            requestedServices.setRequestStatus(requestServiceDto.getRequestStatus());
            requestedServices.setReqPerson(requestServiceDto.getReqPerson());
            requestedServicesDAO.save(requestedServices);
        }
        return null;
    }


    public List<RequestedServices> getRequestedServicePerClient(String email){
        return requestedServicesDAO.findByReqPerson(email);
    }

    public List<RequestedServices>getAllRequestedServices(){
        return requestedServicesDAO.findAll();
    }
}
