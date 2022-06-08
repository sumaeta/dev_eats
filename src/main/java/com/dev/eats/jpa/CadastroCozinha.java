package com.dev.eats.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.eats.domain.modal.Cozinha;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping
	public List<Cozinha> listar(){
		TypedQuery<Cozinha> lista = manager.createQuery("from cozinha", Cozinha.class);
		return lista.getResultList();
	}
}
