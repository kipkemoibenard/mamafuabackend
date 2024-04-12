package com.mamafua.mamafua_backend.controllers;

import com.mamafua.mamafua_backend.entities.AvailableService;
import com.mamafua.mamafua_backend.services.AvailableSvcService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("service")
@CrossOrigin(origins = "*")
public class AvailableServicesController {
    private AvailableSvcService availableSvcService;

    public AvailableServicesController(AvailableSvcService availableSvcService){
        this.availableSvcService = availableSvcService;
    }

    @PostMapping("/save")
    public AvailableService registerService(@RequestBody AvailableService availableService){
       return availableSvcService.registerService(availableService);

    }

    @GetMapping("/getAvailableServices")
    public List<AvailableService>getAllServices(){
        return availableSvcService.getAllServices();
    }

}
