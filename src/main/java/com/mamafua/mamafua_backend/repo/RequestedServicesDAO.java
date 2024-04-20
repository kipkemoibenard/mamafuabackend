package com.mamafua.mamafua_backend.repo;

import com.mamafua.mamafua_backend.entities.RequestedServices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestedServicesDAO extends JpaRepository<RequestedServices, Long> {
    List<RequestedServices> findByReqPerson(String email);
}
