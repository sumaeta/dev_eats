package com.dev.eats.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.eats.domain.modal.Estado;
import com.dev.eats.domain.service.EstadoService;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {
	
	@Autowired
	private EstadoService service;

	@GetMapping
	public ResponseEntity<List<Estado>> listar(){
		List<Estado> estados = service.listar();
		return ResponseEntity.ok().body(estados);
	}
}
