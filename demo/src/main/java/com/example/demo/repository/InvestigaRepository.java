package com.example.demo.repository;

import com.example.demo.model.Investiga;
import com.example.demo.model.InvestigaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvestigaRepository extends JpaRepository<Investiga, InvestigaId>, JpaSpecificationExecutor<Investiga> {
}