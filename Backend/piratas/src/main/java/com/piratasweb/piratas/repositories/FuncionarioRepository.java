package com.piratasweb.piratas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piratasweb.piratas.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
