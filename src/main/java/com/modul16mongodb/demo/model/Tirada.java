package com.modul16mongodb.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="tirades")
public class Tirada {
	
	@Id
	private int id;
	@Field(name="valor1")
	private int valor1;
	@Field(name="valor2")
	private int valor2;
	@Field(name="valortotal")
	private int valortotal;
	@Field(name="victoria")
	private boolean victoria;
	
	@Field(name="usuariid")
	private int usuariid;
	
	private static int nextId = 1;
	
	
	public Tirada(int id, int valor1, int valor2, int valortotal, boolean victoria, int usuariid) {
		super();
		this.id = Tirada.nextId;
		nextId++;
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valortotal = valortotal;
		this.victoria = victoria;
		this.usuariid = usuariid;
	}
	
	public Tirada() {
		this.id = Tirada.nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValortotal() {
		return valortotal;
	}

	public void setValortotal(int valortotal) {
		this.valortotal = valortotal;
	}

	public boolean isVictoria() {
		return victoria;
	}

	public void setVictoria(boolean victoria) {
		this.victoria = victoria;
	}

	public int getUsuariid() {
		return usuariid;
	}

	public void setUsuariid(int usuariid) {
		this.usuariid = usuariid;
	}
	
}
