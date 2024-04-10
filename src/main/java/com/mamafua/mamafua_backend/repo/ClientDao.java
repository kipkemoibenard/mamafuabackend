package com.mamafua.mamafua_backend.repo;

import com.mamafua.mamafua_backend.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao  extends JpaRepository<Client, Integer> {
    Client findByEmailAndPassword(String email, String password);
}
