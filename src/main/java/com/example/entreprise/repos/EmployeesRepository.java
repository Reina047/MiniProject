package com.example.entreprise.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entreprise.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {

}
