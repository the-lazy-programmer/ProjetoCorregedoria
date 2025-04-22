package com.example.demo.repository;

import com.example.demo.model.Emprega;
import com.example.demo.model.EmpregaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmpregaRepository extends JpaRepository<Emprega, EmpregaId>, JpaSpecificationExecutor<Emprega> {
}