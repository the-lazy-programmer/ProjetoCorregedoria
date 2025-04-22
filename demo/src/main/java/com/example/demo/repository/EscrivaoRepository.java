package com.example.demo.repository;

import com.example.demo.model.Escrivao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EscrivaoRepository extends JpaRepository<Escrivao, String>, JpaSpecificationExecutor<Escrivao> {
}