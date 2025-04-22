package com.example.demo.repository;

import com.example.demo.model.Fazpartede;
import com.example.demo.model.FazpartedeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FazpartedeRepository extends JpaRepository<Fazpartede, FazpartedeId>, JpaSpecificationExecutor<Fazpartede> {
}