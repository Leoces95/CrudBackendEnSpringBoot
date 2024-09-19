package com.example.demo.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.Modelo;
import com.example.demo.servicios.Servicios;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controllers {
	
	@Autowired
	private Servicios service;
	
	@GetMapping(value = "/consultar")
	
	public List<Modelo> consultar() {
		return service.consultarPreguntas();
	}
	
	@GetMapping(value = "/consultarId/{id}")
	public Optional<Modelo> consultarId(@PathVariable Integer id) {
		return service.consultarPreguntasporId(id);
	}
	@PostMapping(value = "/insertar")
	public Modelo insertar(@RequestBody Modelo modelo) {
		return service.insertarPreguntas(modelo);
	}
	
	@PutMapping(value = "/actualizar")
	public String actualizar() {
		return("actualizado");
	}
	@DeleteMapping(value = "/eliminar")
	public void eliminar(Integer id) {
		service.eliminar(id);
}}
