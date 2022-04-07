package com.piratasweb.piratas.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.piratasweb.piratas.entities.Projeto;
import com.piratasweb.piratas.repositories.ProjetoRepository;
import com.piratasweb.piratas.services.exceptions.DatabaseException;
import com.piratasweb.piratas.services.exceptions.ResourceNotFoundException;

@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository repository;
	
	public List<Projeto> findAll(){
		return repository.findAll();
	}
	
	public Projeto findById(Long id) {
		Optional<Projeto> obj = repository.findById(id); 
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));

	}
	
	public Projeto insert(Projeto obj) {
		return repository.save(obj);
	}
	
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Projeto uptadate(Long id, Projeto obj) {
		try {
			Projeto entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		}catch (EntityNotFoundException e){
			throw new ResourceNotFoundException(id);
		}
	}
	
	private void updateData(Projeto entity, Projeto obj) {
		entity.setNome(obj.getNome());
		entity.setCliente(obj.getCliente());
		entity.setLider(obj.getLider());
		entity.setQuantidadeHoras(obj.getQuantidadeHoras());
		entity.setDataEntrega(obj.getDataEntrega());
		entity.setPrioridade(obj.getPrioridade());
		entity.setDescricao(obj.getDescricao());
		entity.setValorHora(obj.getValorHora());
	
	}
	

}
