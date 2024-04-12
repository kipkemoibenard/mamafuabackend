package com.mamafua.mamafua_backend.repo;

import com.mamafua.mamafua_backend.entities.RequestedServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestedServicesDAO extends JpaRepository<RequestedServices, Long> {
}
