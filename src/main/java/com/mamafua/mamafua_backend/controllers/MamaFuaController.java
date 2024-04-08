package com.mamafua.mamafua_backend.controllers;

import com.mamafua.mamafua_backend.entities.MamaFua;
import com.mamafua.mamafua_backend.services.MamaFuaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mamafua")
@CrossOrigin(origins = "*")
public class MamaFuaController {
    private  final MamaFuaService mamaFuaService;

    public  MamaFuaController(MamaFuaService mamaFuaService) {
        this.mamaFuaService = mamaFuaService;
    }

    @PostMapping("/register")
    public  String register(@RequestBody MamaFua mamaFua){
        return mamaFuaService.registerMamaFua(mamaFua);
    }
}
