package com.example.entreprise;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entreprise.model.Entreprise;
import com.example.entreprise.repos.EmployeesRepository;

@SpringBootTest
class EntrepriseApplicationTests {

	@Autowired
	private EmployeesRepository employeesRepository;
	@Test
	public void testCreateEmployees() {
	Entreprise entre = new Entreprise("ben bafoun",6000.500,"Rue ");
	employeesRepository.save(entre);
	}
    
	@Test
	public void testFindEmployees()
	{
	Entreprise e = employeesRepository.findById(1L).get();
	System.out.println(e);
	}
	@Test
	public void testUpdateEmployees()
	{
	Entreprise p = employeesRepository.findById(1L).get();
	p.setSalaireEmployees(2000.0);
	employeesRepository.save(p);
	}
	
	@Test
	public void testDeleteEmployees(){
	employeesRepository.deleteById(1L);;
	}
	@Test
	public void testFindAllEmployees()
	{
	List<Entreprise> entre = employeesRepository.findAll();
	for (Entreprise e : entre)
	{
	System.out.println(e);
	}
	}
}
