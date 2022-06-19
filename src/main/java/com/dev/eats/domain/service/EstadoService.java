package com.dev.eats.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.eats.domain.modal.Estado;
import com.dev.eats.domain.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Estado> listar(){
		return repository.findAll();
	}
	
}
