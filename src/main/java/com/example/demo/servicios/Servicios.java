package com.example.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.Modelo;
import com.example.demo.repositorios.Respositorios;

@Service
public class Servicios {
	
	@Autowired
	private Respositorios repositorio;
	
	public List<Modelo> consultarPreguntas() {
		return repositorio.findAll();		
	}
	
	public Optional<Modelo> consultarPreguntasporId(Integer id) {
		return repositorio.findById(id);
	}
	public Modelo insertarPreguntas(Modelo modelo) {
		return repositorio.save(modelo);
		
	}
	public void actualizarPregunta() {
		
	}
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}
}
