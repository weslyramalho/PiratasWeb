package com.piratasweb.piratas.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.piratasweb.piratas.entities.enums.Cargo;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Cargo cargo;
	private String foto;
	private Double salario;
	private String senha;
	
	@JsonIgnore
	@OneToMany(mappedBy = "funcionario")
	private List<Projeto> projetos = new ArrayList<>();
	
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String email, String telefone, Cargo cargo, String foto, Double salario, String senha) {
		super(nome, email, telefone);
		this.cargo = cargo;
		this.foto = foto;
		this.salario = salario;
		this.senha = senha;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
