package com.example.demo.repository;

import com.example.demo.model.Documentar;
import com.example.demo.model.DocumentarId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DocumentarRepository extends JpaRepository<Documentar, DocumentarId>, JpaSpecificationExecutor<Documentar> {
}