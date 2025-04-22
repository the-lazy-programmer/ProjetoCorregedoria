package com.example.demo.repository;

import com.example.demo.model.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SecretariaRepository extends JpaRepository<Secretaria, String>, JpaSpecificationExecutor<Secretaria> {
}