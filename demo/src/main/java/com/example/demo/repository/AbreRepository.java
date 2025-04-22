package com.example.demo.repository;

import com.example.demo.model.Abre;
import com.example.demo.model.AbreId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AbreRepository extends JpaRepository<Abre, AbreId>, JpaSpecificationExecutor<Abre> {
}