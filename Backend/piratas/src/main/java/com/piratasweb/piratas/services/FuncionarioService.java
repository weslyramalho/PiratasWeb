package com.piratasweb.piratas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piratasweb.piratas.entities.Funcionario;
import com.piratasweb.piratas.repositories.FuncionarioRepository;


@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> findAll(){
		return repository.findAll();
	}
	
	public Optional<Funcionario> findById(Long id) {
		return repository.findById(id);

	}
	
	public Funcionario insert(Funcionario obj) {
		return repository.save(obj);
	}

}
