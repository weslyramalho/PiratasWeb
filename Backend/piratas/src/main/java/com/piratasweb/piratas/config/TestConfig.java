package com.piratasweb.piratas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.piratasweb.piratas.entities.Cliente;
import com.piratasweb.piratas.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(1L, "Salomão","salomao@gamail", "123456789", "www.salomao.com.br", "2545555555" , "gasgjjasdj");
		Cliente c2 = new Cliente(1L, "Ana","ana@gamail", "123456789", "www.ana.com.br", "2545555555" , "gasgjjasdj");
		Cliente c3 = new Cliente(1L, "Maria","salomao@gamail", "123456789", "www.maria.com.br", "2545555555" , "gasgjjasdj");
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3));

	}

}
