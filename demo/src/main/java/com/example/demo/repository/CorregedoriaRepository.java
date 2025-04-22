package com.example.demo.repository;

import com.example.demo.model.Corregedoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CorregedoriaRepository extends JpaRepository<Corregedoria, String>, JpaSpecificationExecutor<Corregedoria> {
}