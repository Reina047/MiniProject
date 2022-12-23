package com.example.entreprise.model;


import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employees{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEmployees;
	private String nomEmployees;
	private Date dateEntretien;
	private Date dateEmbauche;
	private Date dateNaissance;
	private String etatEmploye;
	
	
	@ManyToOne
	private Entreprise entreprise;
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	public Employees() {
		super();
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
	public Date getDateEntretien() {
		return dateEntretien;
	}
	public void setDateEntretien(Date dateEntretien) {
		this.dateEntretien = dateEntretien;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getEtatEmploye() {
		return etatEmploye;
	}
	public void setEtatEmploye(String etatEmploye) {
		this.etatEmploye = etatEmploye;
	}
	
	public Employees(String nomEmployees,Date dateEntretien, Date dateEmbauche, Date dateNaissance, String etatEmploye) {
		super();
		this.nomEmployees = nomEmployees;
		this.dateEntretien = dateEntretien;
		this.dateEmbauche = dateEmbauche;
		this.dateNaissance = dateNaissance;
		this.etatEmploye = etatEmploye;
	}
	@Override
	public String toString() {
		return "Employees [idEmployees=" + idEmployees + ", nomEmployees=" + nomEmployees +", dateEntretien=" + dateEntretien + ", dateEmbauche="
				+ dateEmbauche + ", dateNaissance=" + dateNaissance + ", etatEmploye=" + etatEmploye + "]";
	}
	


}
