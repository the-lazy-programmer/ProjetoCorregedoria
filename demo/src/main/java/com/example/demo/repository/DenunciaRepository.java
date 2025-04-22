package com.example.demo.repository;

import com.example.demo.model.Denuncia;
import com.example.demo.model.DenunciaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DenunciaRepository extends JpaRepository<Denuncia, DenunciaId>, JpaSpecificationExecutor<Denuncia> {
}