package com.example.demo.repository;

import com.example.demo.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RelatorioRepository extends JpaRepository<Relatorio, String>, JpaSpecificationExecutor<Relatorio> {
}