package com.example.demo.repository;

import com.example.demo.model.Examina;
import com.example.demo.model.ExaminaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ExaminaRepository extends JpaRepository<Examina, ExaminaId>, JpaSpecificationExecutor<Examina> {
}