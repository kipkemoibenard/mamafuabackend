package com.mamafua.mamafua_backend.controllers;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.LoginRequest;
import com.mamafua.mamafua_backend.entities.MamaFua;
import com.mamafua.mamafua_backend.services.MamaFuaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/login")
    public ResponseEntity<String> loginMamafua(@RequestBody LoginRequest loginRequest) {
        MamaFua mamaFua = mamaFuaService.loginMamaFua(loginRequest.getEmail(), loginRequest.getPassword());
        if (mamaFua != null) {
//            return ResponseEntity.ok("Login successful");
            return null;
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
