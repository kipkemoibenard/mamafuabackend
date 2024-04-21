package com.mamafua.mamafua_backend.services;

import com.mamafua.mamafua_backend.entities.AvailableService;
import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.repo.AvailableServicesDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvailableSvcService {
    private final AvailableServicesDao availableServicesDao;

    public AvailableSvcService(AvailableServicesDao availableServicesDao) {
        this.availableServicesDao = availableServicesDao;
    }

    public AvailableService registerService(AvailableService availableService ) {
        return availableServicesDao.save(availableService);
    }


    public List<AvailableService>getAllServices(){
        return availableServicesDao.findAll();
    }

    public String updateAvailableService(AvailableService availableService, int id){
        Optional<AvailableService> serviceToUpdate = availableServicesDao.findById(id);
        if(serviceToUpdate.isPresent()) {
            AvailableService aService = serviceToUpdate.get();

            aService.setSvcName(availableService.getSvcName());
            aService.setSvcCost(availableService.getSvcCost());
            availableServicesDao.save(aService);
            return null;
        }
        else {
            return "Service with ID " + id + " not found";
        }
    }

    public String deleteAvailableServive(int id){
        Optional<AvailableService> serviceToDelete = availableServicesDao.findById(id);
        if(serviceToDelete.isPresent()) {
            availableServicesDao.deleteById(id);
            return null;
        } else {
            return "Service with ID " + id + " not found";
        }
    }
}
