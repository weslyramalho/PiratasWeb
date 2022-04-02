package com.piratasweb.piratas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.piratasweb.piratas.entities.Cliente;
import com.piratasweb.piratas.entities.Funcionario;
import com.piratasweb.piratas.entities.enums.Cargo;
import com.piratasweb.piratas.repositories.ClienteRepository;
import com.piratasweb.piratas.repositories.FuncionarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(1L ,"ana", "ana@ana.com", "5545555554", "www.salomao.com.br", "2545555555" , "gasgjjasdj");
		Cliente c2 = new Cliente(2L,  "Maria", "maria@maria.com", "123654789524", "www.ana.com.br", "2545555555" , "gasgjjasdj");
		Cliente c3 = new Cliente(3L, "Andre", "andre@andre.com", "322252525252", "www.maria.com.br", "2545555555" , "gasgjjasdj");
		
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
		Funcionario f1= new Funcionario(1L, "João", "@joao", "45612323", Cargo.BACKEND, "sdff", 45.62, "kjsdkfjkfj" );


		funcionarioRepository.save(f1);
	}

}
