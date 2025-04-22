package com.example.demo.repository;

import com.example.demo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String>, JpaSpecificationExecutor<Funcionario> {
}