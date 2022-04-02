package com.piratasweb.piratas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piratasweb.piratas.entities.OrderProjetos;
import com.piratasweb.piratas.entities.Projeto;

public interface OrderProjetosRepository extends JpaRepository<OrderProjetos, Long>{

}
