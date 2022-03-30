package com.piratasweb.piratas.entities;

public class Cliente extends Pessoa {
	
	private String site;
	private String cnpj;
	private String logo;
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String email, String telefone, String site, String cnpj, String logo) {
		super(nome, email, telefone);
		this.site = site;
		this.cnpj = cnpj;
		this.logo = logo;
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
	@Override
	public String toString() {
		return "Cliente [site=" + site + ", cnpj=" + cnpj + ", logo=" + logo + "]";
	}
	
	
	

}
