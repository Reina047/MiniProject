package com.example.entreprise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entreprise.model.Employees;
import com.example.entreprise.service.employeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController{
	@Autowired
	employeesService employeesservice;
	
	@PostMapping("/create employees")
	@ResponseBody
	public Employees create(@RequestBody Employees e) {
		return employeesservice.saveEmployees(e);
	}
	@PutMapping("/update employees")
	@ResponseBody
	public Employees update(@RequestBody Employees e) {
		return employeesservice.updateEmployees(e);
	}
	@DeleteMapping("/delete employees")
	@ResponseBody
	public void deleteEmployees(@RequestBody Employees e) {
		employeesservice.deleteEmployees(e);
	}
	@DeleteMapping("/delete employees/{id}")
	@ResponseBody
	public	void deleteEmployees(@PathVariable Long id) {
		employeesservice.deleteEmployeesById(id);
	}
	@GetMapping("/read par id employees/{id}")
	@ResponseBody
	public Employees readid (@PathVariable Long id) {
		return employeesservice.getEmployees(id);
	}
    @GetMapping("/reademployees")
    @ResponseBody
	public List<Employees> read() {
		return employeesservice.getAllEmployees();
	}	
	@PutMapping("/etat employees/{idEmployees}/{etatEmploye}")
	@ResponseBody
	public void etatemployees(@PathVariable("idEmployees") Long idEmployees,@PathVariable("etatEmploye") String etatEmploye){
		employeesservice.etatemployees(idEmployees, etatEmploye);
	}

}
