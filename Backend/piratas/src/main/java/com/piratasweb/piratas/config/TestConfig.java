package com.piratasweb.piratas.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.piratasweb.piratas.entities.Cliente;
import com.piratasweb.piratas.entities.Funcionario;
import com.piratasweb.piratas.entities.Projeto;
import com.piratasweb.piratas.entities.enums.Cargo;
import com.piratasweb.piratas.repositories.ClienteRepository;
import com.piratasweb.piratas.repositories.FuncionarioRepository;
import com.piratasweb.piratas.repositories.ProjetoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private ProjetoRepository projetoRepository;

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(1L ,"ana", "ana@ana.com", "5545555554", "www.salomao.com.br", "2545555555" , "gasgjjasdj");
		Cliente c2 = new Cliente(2L,  "Maria", "maria@maria.com", "123654789524", "www.ana.com.br", "2545555555" , "gasgjjasdj");
		Cliente c3 = new Cliente(3L, "Andre", "andre@andre.com", "322252525252", "www.maria.com.br", "2545555555" , "gasgjjasdj");
		
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
		Funcionario f1= new Funcionario(1L, "João", "@joao", "45612323", Cargo.BACKEND, "sdff", 45.62, "kjsdkfjkfj" );
		Funcionario f2= new Funcionario(2L, "Ana", "@joao", "45612323", Cargo.FRONTEND, "sdff", 45.62, "kjsdkfjkfj" );
		Funcionario f3= new Funcionario(3L, "Paula", "@joao", "45612323", Cargo.DESIGNER, "sdff", 45.62, "kjsdkfjkfj" );
		Funcionario f4= new Funcionario(4L, "Maria", "@joao", "45612323", Cargo.GERENTE, "sdff", 45.62, "kjsdkfjkfj" );
		Funcionario f5= new Funcionario(5L, "Abel", "@joao", "45612323", Cargo.QA, "sdff", 45.62, "kjsdkfjkfj" );
		Funcionario f6= new Funcionario(6L, "Renata", "@joao", "45612323", Cargo.DEVOPS, "sdff", 45.62, "kjsdkfjkfj" );


		funcionarioRepository.saveAll(Arrays.asList(f1, f2, f3, f4, f5, f6));
		
		Projeto p1 = new Projeto(1L, "COMETA X", c1, f4, 25L, Instant.parse("2019-06-20T21:53:07Z"), "Alta", "Projetos web marter", 150.0);
		
		projetoRepository.save(p1);
	}

}
