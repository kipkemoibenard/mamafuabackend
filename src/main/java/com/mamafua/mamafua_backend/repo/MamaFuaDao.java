package com.mamafua.mamafua_backend.repo;

import com.mamafua.mamafua_backend.entities.Client;
import com.mamafua.mamafua_backend.entities.MamaFua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MamaFuaDao extends JpaRepository<MamaFua, Integer> {
    MamaFua findByEmailAndPassword(String email, String password);

    Optional<MamaFua> findByEmail(String email);
}
