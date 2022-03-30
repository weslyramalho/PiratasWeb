package com.piratasweb.piratas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piratasweb.piratas.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
