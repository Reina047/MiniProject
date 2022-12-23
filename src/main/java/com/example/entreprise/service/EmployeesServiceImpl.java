package com.example.entreprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entreprise.model.Employees;
import com.example.entreprise.model.Entreprise;
import com.example.entreprise.repos.EmployeesRepository;

@Service
public class EmployeesServiceImpl implements employeesService {
	@Autowired
    EmployeesRepository employeesRepository;
	
	@Override
	public Employees saveEmployees(Employees e) {
		return employeesRepository.save(e);
	}

	@Override
	public Employees updateEmployees(Employees e) {
		return employeesRepository.save(e);
	}

	@Override
	public void deleteEmployees(Employees e) {
		employeesRepository.delete(e);
		
	}

	@Override
	public void deleteEmployeesById(Long id) {
		employeesRepository.deleteById(id);		
	}

	@Override
	public Employees getEmployees(Long id) {
		return employeesRepository.findById(id).get();
	}

	@Override
	public List<Employees> getAllEmployees() {
		return employeesRepository.findAll();
	}
	
	@Override
	public void etatemployees(Long idEmployees, String etatEmploye) {
		Employees employeesmodel = employeesRepository.findById(idEmployees).get();
		employeesmodel.setEtatEmploye(etatEmploye);
		employeesRepository.save(employeesmodel);
	}

}
