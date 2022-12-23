package com.example.entreprise.service;

import java.util.List;

import com.example.entreprise.model.Entreprise;

public interface entrepriseService {
	public void AffecterEmployeesEntreprise(Long idEmployees,Long idEntreprise);
	Entreprise saveEntreprise(Entreprise e);
	Entreprise updateEntreprise(Entreprise e);
	void deleteEntreprise(Entreprise e);
	void deleteEntrepriseById(Long id);
	Entreprise getEntreprise(Long id);
	List<Entreprise> getAllEntreprise();

}