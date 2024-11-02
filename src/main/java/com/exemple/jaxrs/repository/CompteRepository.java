package com.exemple.jaxrs.repository;

import com.exemple.jaxrs.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
