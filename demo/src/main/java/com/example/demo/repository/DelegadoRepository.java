package com.example.demo.repository;

import com.example.demo.model.Delegado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DelegadoRepository extends JpaRepository<Delegado, String>, JpaSpecificationExecutor<Delegado> {
}