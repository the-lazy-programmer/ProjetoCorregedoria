package com.example.demo.repository;

import com.example.demo.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CasoRepository extends JpaRepository<Caso, String>, JpaSpecificationExecutor<Caso> {
}