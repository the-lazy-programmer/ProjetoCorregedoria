package com.example.demo.repository;

import com.example.demo.model.Inquerito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InqueritoRepository extends JpaRepository<Inquerito, String>, JpaSpecificationExecutor<Inquerito> {
}