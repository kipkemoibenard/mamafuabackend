package com.mamafua.mamafua_backend.repo;

import com.mamafua.mamafua_backend.entities.MamaFua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MamaFuaDao extends JpaRepository<MamaFua, Integer> {
}
