package com.mamafua.mamafua_backend.services;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.MamaFua;
import com.mamafua.mamafua_backend.repo.MamaFuaDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MamaFuaService {
    private  final MamaFuaDao mamaFuaDao;

    public  MamaFuaService(MamaFuaDao mamaFuaDao) {
        this.mamaFuaDao = mamaFuaDao;
    }

//    public String registerMamaFua(MamaFua mamaFua) {
//        mamaFuaDao.save(mamaFua);
//        return null;
//    }

    public String registerMamaFua(MamaFua mamaFua) {
        // Check if email already exists
        Optional<MamaFua> existingMamaFua = mamaFuaDao.findByEmail(mamaFua.getEmail());

        if (existingMamaFua.isPresent()) {
            // Email already exists, display message
            return "Email already registered!";
        } else {
            // Email doesn't exist, proceed with registration
            mamaFuaDao.save(mamaFua);
            return "Registration successful!";
        }
    }

    public List<MamaFua>getAllMamafua(){
        return mamaFuaDao.findAll();
    }

    public MamaFua loginMamaFua(String email, String password) {
        return mamaFuaDao.findByEmailAndPassword(email, password);
    }

    public String updateMamaFua(MamaFua mamaFua, int id) {
        Optional<MamaFua> mamaFua1 = mamaFuaDao.findById(id);
        if (mamaFua1.isPresent()) {
            MamaFua existingMamaFua = mamaFuaDao.findById(id).get();

            existingMamaFua.setMamafuaName(mamaFua.getMamafuaName());
            existingMamaFua.setCounty(mamaFua.getCounty());
            existingMamaFua.setEmail(mamaFua.getEmail());

            mamaFuaDao.save(existingMamaFua);
            return "Update successful!";
        } else {
            return "Client with not found.";
        }
    }

    public String deleteAvailableServive(int id) {
        Optional<MamaFua> mamafuaAvailable = mamaFuaDao.findById(id);
        if (mamafuaAvailable.isPresent()) {
            mamaFuaDao.deleteById(id);
            return  null;
        } else {
            return "Service provider with ID " + id + " not found";
        }
    }
}
