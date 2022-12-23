package com.example.entreprise;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entreprise.model.Entreprise;
import com.example.entreprise.repos.EntrepriseRepository;

@SpringBootTest
class EntrepriseApplicationTests {

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	@Test
	public void testCreateEmployees() {
	Entreprise entre = new Entreprise("1582","aaa","huuu");
	entrepriseRepository.save(entre);
	}
    
	@Test
	public void testFindEntreprise()
	{
	Entreprise e = entrepriseRepository.findById(1L).get();
	System.out.println(e);
	}
	@Test
	public void testUpdateEntreprise()
	{
	Entreprise p = entrepriseRepository.findById(1L).get();
	p.setRaisonSociale("gfggg");
	entrepriseRepository.save(p);
	}
	
	@Test
	public void testDeleteEmployees(){
	entrepriseRepository.deleteById(1L);;
	}
	@Test
	public void testFindAllEmployees()
	{
	List<Entreprise> entre = entrepriseRepository.findAll();
	for (Entreprise e : entre)
	{
	System.out.println(e);
	}
	}
}
