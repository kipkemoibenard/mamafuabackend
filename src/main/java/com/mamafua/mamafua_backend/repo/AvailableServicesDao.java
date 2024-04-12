package com.mamafua.mamafua_backend.repo;

import com.mamafua.mamafua_backend.entities.AvailableService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailableServicesDao extends JpaRepository<AvailableService, Integer> {
}
