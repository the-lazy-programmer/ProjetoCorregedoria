package com.example.demo.repository;

import com.example.demo.model.Ordemdeprisao;
import com.example.demo.model.OrdemdeprisaoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrdemdeprisaoRepository extends JpaRepository<Ordemdeprisao, OrdemdeprisaoId>, JpaSpecificationExecutor<Ordemdeprisao> {
}