package com.example.demo.repository;

import com.example.demo.model.Relatar;
import com.example.demo.model.RelatarId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RelatarRepository extends JpaRepository<Relatar, RelatarId>, JpaSpecificationExecutor<Relatar> {
}