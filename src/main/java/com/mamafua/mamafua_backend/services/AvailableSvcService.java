package com.mamafua.mamafua_backend.services;

import com.mamafua.mamafua_backend.entities.AvailableService;
import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.repo.AvailableServicesDao;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
