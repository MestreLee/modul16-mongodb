package com.modul16mongodb.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="usuaris")
public class Usuari {
	
	@Id
	private int id;
	@Field(name="nom")
	private String nom;
	@Field(name="tirades")
	private int tirades;
	@Field(name="guanyades")
	private int guanyades;
	@Field(name="promig")
	private double promig;
	
	private static int nextId = 1;
	
	public Usuari(String nom, int tirades, int guanyades, double promig) {
		super();
		this.id = Usuari.nextId;
		nextId++;
		this.nom = nom;
		this.tirades = tirades;
		this.guanyades = guanyades;
		this.promig = promig;
	}
	
	public Usuari() {
		this.id = Usuari.nextId;
		nextId++;
	}
	
	public int getGuanyades() {
		return guanyades;
	}

	public void setGuanyades(int guanyades) {
		this.guanyades = guanyades;
	}

	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTirades() {
		return tirades;
	}
	public void setTirades(int tirades) {
		this.tirades = tirades;
	}
	public void incrTirades() {
		this.setTirades(this.getTirades() + 1);
	}
	public void incrGuanyades() {
		this.setGuanyades(this.getGuanyades() + 1);
	}
	
	public double getPromig() {
		return this.promig;
	}
	
	public void setPromig() {
		
		if (this.tirades != 0) {
			if(this.guanyades != 0) {
				this.promig =  (float)this.guanyades / (float)this.tirades * 100;
			}
		}
		
	}

	@Override
	public String toString() {
		return "Usuari [id=" + id + ", nom=" + nom + ", promig=" + promig + "]" + "\n";
	}
	
	
	
}
