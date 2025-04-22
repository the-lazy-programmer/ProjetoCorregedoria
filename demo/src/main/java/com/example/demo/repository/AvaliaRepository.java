package com.example.demo.repository;

import com.example.demo.model.Avalia;
import com.example.demo.model.AvaliaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AvaliaRepository extends JpaRepository<Avalia, AvaliaId>, JpaSpecificationExecutor<Avalia> {
}