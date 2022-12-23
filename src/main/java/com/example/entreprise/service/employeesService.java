package com.example.entreprise.service;

import java.util.List;

import com.example.entreprise.model.Employees;


public interface employeesService {
	public void etatemployees(Long idEmployees, String etatEmploye);
	Employees saveEmployees(Employees e);
	Employees updateEmployees(Employees e);
	void deleteEmployees(Employees e);
	void deleteEmployeesById(Long id);
	Employees getEmployees(Long id);
	List<Employees> getAllEmployees();
}
