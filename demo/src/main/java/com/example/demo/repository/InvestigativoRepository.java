package com.example.demo.repository;

import com.example.demo.model.Investigativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvestigativoRepository extends JpaRepository<Investigativo, String>, JpaSpecificationExecutor<Investigativo> {
}