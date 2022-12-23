package com.example.entreprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entreprise.model.Employees;
import com.example.entreprise.model.Entreprise;
import com.example.entreprise.repos.EmployeesRepository;
import com.example.entreprise.repos.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements entrepriseService{
    @Autowired
    EntrepriseRepository entrepriseRepository;
    @Autowired
    EmployeesRepository employeesRepository;
	@Override
	public void AffecterEmployeesEntreprise(Long idEmployees, Long idEntreprise) {
		Entreprise entreprisemodel = entrepriseRepository.findById(idEntreprise).get();
		Employees employeesmodel = employeesRepository.findById(idEmployees).get();
		employeesmodel.setEntreprise(entreprisemodel);
		employeesRepository.save(employeesmodel);
	}
	
	@Override
	public Entreprise saveEntreprise(Entreprise e) {
		return entrepriseRepository.save(e);
	}

	@Override
	public Entreprise updateEntreprise(Entreprise e) {
		return entrepriseRepository.save(e);
	}

	@Override
	public void deleteEntreprise(Entreprise e) {
		entrepriseRepository.delete(e);
		
	}

	@Override
	public void deleteEntrepriseById(Long id) {
		entrepriseRepository.deleteById(id);		
	}

	@Override
	public Entreprise getEntreprise(Long id) {
		return entrepriseRepository.findById(id).get();
	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		return entrepriseRepository.findAll();
	}



}
