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

import com.example.entreprise.model.Entreprise;
import com.example.entreprise.service.entrepriseService;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {
	
	@Autowired
	entrepriseService entrepriseservice;
	
	@PutMapping("/AffecterEmployeesEntreprise/{idEmployees}/{idEntreprise}")
	@ResponseBody
	public void AffecterEmployeesEntreprise (@PathVariable("idEmployees") Long idEmployees,@PathVariable("idEntreprise") Long idEntreprise) {
		entrepriseservice.AffecterEmployeesEntreprise(idEmployees, idEntreprise);
	}
	@PostMapping("/create")
	@ResponseBody
	public Entreprise create(@RequestBody Entreprise e) {
		return entrepriseservice.saveEntreprise(e);
	}
	@PutMapping("/update")
	@ResponseBody
	public Entreprise update(@RequestBody Entreprise e) {
		return entrepriseservice.updateEntreprise(e);
	}
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteEmployees(@RequestBody Entreprise e) {
		entrepriseservice.deleteEntreprise(e);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public	void deleteEmployees(@PathVariable Long id) {
	   entrepriseservice.deleteEntrepriseById(id);
	}
	@GetMapping("/readparid/{id}")
	@ResponseBody
	public Entreprise readid (@PathVariable Long id) {
		return entrepriseservice.getEntreprise(id);
	}
    @GetMapping("/read")
    @ResponseBody
	public List<Entreprise> read() {
		return entrepriseservice.getAllEntreprise();
	}	
}
