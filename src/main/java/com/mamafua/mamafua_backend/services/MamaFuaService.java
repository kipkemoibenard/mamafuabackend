package com.mamafua.mamafua_backend.services;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.MamaFua;
import com.mamafua.mamafua_backend.repo.MamaFuaDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MamaFuaService {
    private  final MamaFuaDao mamaFuaDao;

    public  MamaFuaService(MamaFuaDao mamaFuaDao) {
        this.mamaFuaDao = mamaFuaDao;
    }

    public String registerMamaFua(MamaFua mamaFua) {
        mamaFuaDao.save(mamaFua);
        return null;
    }

    public List<MamaFua>getAllMamafua(){
        return mamaFuaDao.findAll();
    }

    public MamaFua loginMamaFua(String email, String password) {
        return mamaFuaDao.findByEmailAndPassword(email, password);
    }
}
