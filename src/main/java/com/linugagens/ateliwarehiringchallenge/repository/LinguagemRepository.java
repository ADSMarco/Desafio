package com.linugagens.ateliwarehiringchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linguagens.ateliwarehiringchallenge.models.Linguagem;

public interface LinguagemRepository extends JpaRepository<Linguagem, Long>{

	Linguagem findById(long id);
	
}
