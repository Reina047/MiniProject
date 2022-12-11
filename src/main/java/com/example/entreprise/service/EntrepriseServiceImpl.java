package com.example.entreprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entreprise.model.Entreprise;
import com.example.entreprise.repos.EmployeesRepository;

@Service
public class EntrepriseServiceImpl implements entrepriseService{
    @Autowired
	EmployeesRepository employeesRepository;
    
	@Override
	public Entreprise saveEmployees(Entreprise e) {
		return employeesRepository.save(e);
	}

	@Override
	public Entreprise updateEmployees(Entreprise e) {
		return employeesRepository.save(e);
	}

	@Override
	public void deleteEmployees(Entreprise e) {
		employeesRepository.delete(e);
		
	}

	@Override
	public void deleteEmployeesById(Long id) {
		employeesRepository.deleteById(id);		
	}

	@Override
	public Entreprise getEmployees(Long id) {
		return employeesRepository.findById(id).get();
	}

	@Override
	public List<Entreprise> getAllEmployees() {
		return employeesRepository.findAll();
	}

}
