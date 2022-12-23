package com.example.entreprise.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Entreprise{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEntreprise;
	private String raisonSociale;
	private String MatriculeFiscale;
	private String adresseEntreprise;
	
	@OneToMany(mappedBy = "idEmployees")
	@JsonIgnore
	private List<Employees> employees;
	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	public Entreprise() {
		super();
	}

	public Entreprise(String raisonSociale, String matriculeFiscale, String adresseEntreprise) {
		super();
		this.raisonSociale = raisonSociale;
		this.MatriculeFiscale = matriculeFiscale;
		this.adresseEntreprise = adresseEntreprise;
	}

	public Long getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getMatriculeFiscale() {
		return MatriculeFiscale;
	}

	public void setMatriculeFiscale(String matriculeFiscale) {
		MatriculeFiscale = matriculeFiscale;
	}

	public String getAdresseEntreprise() {
		return adresseEntreprise;
	}

	public void setAdresseEntreprise(String adresseEntreprise) {
		this.adresseEntreprise = adresseEntreprise;
	}

	@Override
	public String toString() {
		return "Entreprise [idEntreprise=" + idEntreprise + ", raisonSociale=" + raisonSociale + ", MatriculeFiscale="
				+ MatriculeFiscale + ", adresseEntreprise=" + adresseEntreprise + "]";
	}

	
	
	
}
