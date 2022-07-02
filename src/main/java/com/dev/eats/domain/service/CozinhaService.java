package com.dev.eats.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.eats.domain.modal.Cozinha;
import com.dev.eats.domain.repositories.CozinhaRepository;
import com.dev.eats.domain.service.exception.EntidadeNaoEncontrada;

@Service
public class CozinhaService {

	@Autowired
	private CozinhaRepository repository;
	
	@Transactional(readOnly = true)
	public List<Cozinha> listar(){
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Cozinha buscar(Long id) {
		 Optional<Cozinha> cozinha = repository.findById(id);
		 
		 if(cozinha.isEmpty()) {
			 throw new EntidadeNaoEncontrada("Não foi possível encontrar a cozinha de ID: " + id);
		 }
		return cozinha.get();
	}
	
	public Cozinha salvar(Cozinha cozinha) {
		cozinha.setId(null);
		return repository.save(cozinha);
	}
}
