package com.piratasweb.piratas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piratasweb.piratas.entities.Cliente;
import com.piratasweb.piratas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);

	}
	
	public Cliente insert(Cliente obj) {
		return repository.save(obj);
	}
	
	
	

}
