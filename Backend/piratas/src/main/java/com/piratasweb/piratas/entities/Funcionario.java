package com.piratasweb.piratas.entities;

public class Funcionario extends Pessoa {
	private String cargo;
	private String foto;
	private Double salario;
	private String senha;
	
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String email, String telefone, String cargo, String foto, Double salario, String senha) {
		super(nome, email, telefone);
		this.cargo = cargo;
		this.foto = foto;
		this.salario = salario;
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
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
