package com.example.demo.repository;

import com.example.demo.model.Denunciantenaoanonimo;
import com.example.demo.model.DenunciantenaoanonimoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DenunciantenaoanonimoRepository extends JpaRepository<Denunciantenaoanonimo, DenunciantenaoanonimoId>, JpaSpecificationExecutor<Denunciantenaoanonimo> {
}