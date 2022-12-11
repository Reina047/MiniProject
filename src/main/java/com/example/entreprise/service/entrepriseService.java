package com.example.entreprise.service;

import java.util.List;

import com.example.entreprise.model.Entreprise;

public interface entrepriseService {
	Entreprise saveEmployees(Entreprise e);
	Entreprise updateEmployees(Entreprise e);
	void deleteEmployees(Entreprise e);
	void deleteEmployeesById(Long id);
	Entreprise getEmployees(Long id);
	List<Entreprise> getAllEmployees();

}