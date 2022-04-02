package com.piratasweb.piratas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piratasweb.piratas.entities.Projeto;
import com.piratasweb.piratas.services.ProjetoService;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService service;
	
	@GetMapping
	public ResponseEntity<List<Projeto>> findAll(){
		List<Projeto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
