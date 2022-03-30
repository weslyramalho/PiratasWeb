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

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String site;
	private String cnpj;
	private String logo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Projeto> projetos = new ArrayList<>();
	
	public Cliente() {
		super();
	}
	public Cliente(Long id, String nome, String email, String telefone, String site, String cnpj, String logo) {
		super(nome, email, telefone);
		this.id = id;
		this.site = site;
		this.cnpj = cnpj;
		this.logo = logo;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	@Override
	public String toString() {
		return "Cliente [site=" + site + ", cnpj=" + cnpj + ", logo=" + logo + "]";
	}
	
	
	

}
