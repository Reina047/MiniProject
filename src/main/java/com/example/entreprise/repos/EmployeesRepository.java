package com.example.entreprise.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entreprise.model.Entreprise;

public interface EmployeesRepository extends JpaRepository<Entreprise, Long> {

}
