package com.example.demo.repository;

import com.example.demo.model.Detente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DetenteRepository extends JpaRepository<Detente, String>, JpaSpecificationExecutor<Detente> {
}