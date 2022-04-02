package com.piratasweb.piratas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piratasweb.piratas.entities.Projeto;
import com.piratasweb.piratas.repositories.ProjetoRepository;

@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository repository;
	
	public List<Projeto> findAll(){
		return repository.findAll();
	}
	
	public Optional<Projeto> findById(Long id) {
		return repository.findById(id);

	}
	
	public Projeto insert(Projeto obj) {
		return repository.save(obj);
	}
	
	
	

}
