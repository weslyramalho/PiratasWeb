package com.piratasweb.piratas.entities;

import java.time.Instant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.piratasweb.piratas.entities.pk.ProjetosPk;

@Entity
@Table(name = "tb_orde_projetos") 
public class OrderProjetos {

	@EmbeddedId
	private ProjetosPk id = new ProjetosPk();
	private Double valor;
	
	public OrderProjetos() {
		
	}

	public OrderProjetos(Funcionario funcionario, Projeto projeto, Double valor) {
		id.setFuncionario(funcionario);
		id.setProjeto(projeto);
		this.valor = valor;
		
	}
	
	@JsonIgnore
	public Funcionario getFuncionario() {
		return id.getFuncionario();
	}
	public void setFuncionaio(Funcionario funcionario) {
		id.setFuncionario(funcionario);
	}
	public Projeto getProjeto() {
		return id.getProjeto();
	}
	public void setProjeto(Projeto projeto) {
		id.setProjeto(projeto);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		getProjeto().preco(valor);
	}

	
	
	
	
	
	

}
