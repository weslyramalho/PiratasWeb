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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.piratasweb.piratas.entities.pk.ProjetosPk;


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
	
	private Funcionario lider;
	
	@OneToMany(mappedBy = "id.projeto")
	private Set<OrderProjetos> ativos = new HashSet<>();
	
	public Projeto() {
	
	}

	public Projeto(Long id, String nome, Cliente cliente, Funcionario lider) {
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
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

	public Funcionario getLider() {
		return lider;
	}

	public void setLider(Funcionario lider) {
		this.lider = lider;
	}

	public Set<OrderProjetos> getAtivos() {
		return ativos;
	}

	public void setAtivos(Set<OrderProjetos> ativos) {
		this.ativos = ativos;
	}
	
	

	
	
	
	
	

}
