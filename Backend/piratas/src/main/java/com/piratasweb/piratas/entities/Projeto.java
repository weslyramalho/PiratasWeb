package com.piratasweb.piratas.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Projeto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String nome;
	
	private Cliente cliente;
	private Long quantidadeHoras;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dataEntrega;
	private String prioridade;
	private String descricao;
	
	private Funcionario lider;
	private Double valorHora;
	
	private List<Funcionario> equipeAtiva = new ArrayList<>();
	
	public Projeto() {
	
	}

	public Projeto(Long id, String nome, Cliente cliente, Long quantidadeHoras, Instant dataEntrega, String prioridade,
			String descricao, Funcionario lider, Double valorHora, List<Funcionario> equipeAtiva) {
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.quantidadeHoras = quantidadeHoras;
		this.dataEntrega = dataEntrega;
		this.prioridade = prioridade;
		this.descricao = descricao;
		this.lider = lider;
		this.valorHora = valorHora;
		this.equipeAtiva = equipeAtiva;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public Funcionario getLider() {
		return lider;
	}

	public void setLider(Funcionario lider) {
		this.lider = lider;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public List<Funcionario> getEquipeAtiva() {
		return equipeAtiva;
	}

	public void setEquipeAtiva(List<Funcionario> equipeAtiva) {
		this.equipeAtiva = equipeAtiva;
	}
	
	
	
	
	
	
	

}
