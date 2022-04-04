package com.piratasweb.piratas.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tb_projeto")
public class Projeto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "lider_id")
	private Funcionario lider;
	private Long quantidadeHoras;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dataEntrega;
	private String prioridade;
	private String descricao;
	private Double valorHora;
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "Funcionario_Projetos", 
			joinColumns = @JoinColumn(name= "projeto_id"),
			inverseJoinColumns = @JoinColumn(name = "funcionario_id"))
	private List<Funcionario> funcionarios;
	
	
	

	
	public Projeto() {
	
	}
	

	public Projeto(Long id, String nome, Cliente cliente, Funcionario lider,Long quantidadeHoras, Instant dataEntrega,
			String prioridade, String descricao, Double valorHora, List<Funcionario> funcionarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.lider = lider;
		this.quantidadeHoras = quantidadeHoras;
		this.dataEntrega = dataEntrega;
		this.prioridade = prioridade;
		this.descricao = descricao;
		this.valorHora = valorHora;
		this.funcionarios = funcionarios;
	}
	
	


	public Funcionario getLider() {
		return lider;
	}


	public void setLider(Funcionario lider) {
		this.lider = lider;
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


	public Double getValorHora() {
		return valorHora;
	}


	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}





	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Double getPreco() {
		return valorHora * quantidadeHoras;
	}
	
	

	
	
	
	
	

}
