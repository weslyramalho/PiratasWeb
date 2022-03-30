package com.piratasweb.piratas.entities;

import java.time.Instant;
import java.util.ArrayList;

import java.util.List;

public class Projeto {
	
	private String nome;
	private Cliente cliente;
	private Long quantidadeHoras;
	private Instant dataEntrega;
	private String prioridade;
	private String descricao;
	private Funcionario lider;
	private Double valorHora;
	private List<Funcionario> equipeAtiva = new ArrayList<>();
	
	public Projeto() {
	
	}

	public Projeto(String nome, Cliente cliente, Long quantidadeHoras, Instant dataEntrega, String prioridade,
			String descricao, Funcionario lider, Double valorHora, List<Funcionario> equipeAtiva) {
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
