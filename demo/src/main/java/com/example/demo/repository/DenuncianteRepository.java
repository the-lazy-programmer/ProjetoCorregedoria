package com.example.demo.repository;

import com.example.demo.model.Denunciante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DenuncianteRepository extends JpaRepository<Denunciante, Boolean>, JpaSpecificationExecutor<Denunciante> {
}