package com.example.entreprise.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entreprise.model.Entreprise;
@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
