package com.example.backend.repository;

import com.example.backend.model.Administrateur;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

@RepositoryRestResource
public interface AdminRepository extends JpaRepository<Administrateur, Long> {
	List<Administrateur>findAllByRoleId(Long id);
	Optional<Administrateur> getUserByLoginAndPassword(@PathVariable("login") String login, @PathVariable("password") String password);
}


