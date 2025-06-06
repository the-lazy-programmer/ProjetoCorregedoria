package com.example.demo.repository;

import com.example.demo.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DocumentoRepository extends JpaRepository<Documento, String>, JpaSpecificationExecutor<Documento> {
}