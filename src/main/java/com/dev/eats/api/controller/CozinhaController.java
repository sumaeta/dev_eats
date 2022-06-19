package com.dev.eats.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.eats.domain.modal.Cozinha;
import com.dev.eats.domain.service.CozinhaService;

@RestController
@RequestMapping("/api/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaService service;
	
	@GetMapping
	public ResponseEntity<List<Cozinha>> listar(){
		List<Cozinha> cozinhas = service.listar();
		return ResponseEntity.ok().body(cozinhas);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cozinha> buscar(@PathVariable Long id){
		Cozinha cozinha = service.buscar(id);
		return ResponseEntity.ok().body(cozinha);
	}
	
	@PostMapping
	public void salvar(@RequestBody @Valid Cozinha cozinha) {
		service.salvar(cozinha);
	}
}
