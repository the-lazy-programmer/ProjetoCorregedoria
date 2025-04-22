package com.example.demo.repository;

import com.example.demo.model.Apf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ApfRepository extends JpaRepository<Apf, String>, JpaSpecificationExecutor<Apf> {
}