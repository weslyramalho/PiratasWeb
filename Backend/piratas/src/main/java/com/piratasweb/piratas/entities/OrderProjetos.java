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
	private Long quantidadeHoras;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dataEntrega;
	private String prioridade;
	private String descricao;
	private Double valorHora;
	
	public OrderProjetos() {
		
	}

	public OrderProjetos(Funcionario funcionario, Projeto projeto, Long quantidadeHoras, Instant dataEntrega, String prioridade, String descricao,
			Double valorHora) {
		id.setFuncionario(funcionario);
		id.setProjeto(projeto);
		this.quantidadeHoras = quantidadeHoras;
		this.dataEntrega = dataEntrega;
		this.prioridade = prioridade;
		this.descricao = descricao;
		this.valorHora = valorHora;
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

	public Long getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Long quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Instant getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Instant dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	
	
	

}
