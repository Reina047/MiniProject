package com.example.entreprise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entreprise {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEmployees;
	private String nomEmployees;
	private Double salaireEmployees;
	private String adresseEmployees;
	
	public Entreprise() {
		super();
	}
	
	
	public Entreprise(String nomEmployees, Double salaireEmployees, String adresseEmployees) {
		super();
		this.nomEmployees = nomEmployees;
		this.salaireEmployees = salaireEmployees;
		this.adresseEmployees = adresseEmployees;
	}


	public Long getIdEmployees() {
		return idEmployees;
	}
	public void setIdEmployees(Long idEmployees) {
		this.idEmployees = idEmployees;
	}
	public String getNomEmployees() {
		return nomEmployees;
	}
	public void setNomEmployees(String nomEmployees) {
		this.nomEmployees = nomEmployees;
	}
	public Double getSalaireEmployees() {
		return salaireEmployees;
	}
	public void setSalaireEmployees(Double salaireEmployees) {
		this.salaireEmployees = salaireEmployees;
	}
	public String getAdresseEmployees() {
		return adresseEmployees;
	}
	public void setAdresseEmployees(String adresseEmployees) {
		this.adresseEmployees = adresseEmployees;
	}


	@Override
	public String toString() {
		return "Entreprise [idEmployees=" + idEmployees + ", nomEmployees=" + nomEmployees + ", salaireEmployees="
				+ salaireEmployees + ", adresseEmployees=" + adresseEmployees + "]";
	}
	
	
}
