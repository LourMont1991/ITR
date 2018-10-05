package com.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.entity.Biblioteca;
import com.ejercicio.entity.Response;
import com.ejercicio.service.BibliotecaService;

@RestController
public class BibliotecaController {
	
	@Autowired
	private BibliotecaService bibliotecaService;
	
	@RequestMapping(value="/insertarBiblioteca", method=RequestMethod.POST)
	public Response insert(@RequestBody Biblioteca biblioteca) {
		
		return bibliotecaService.insert(biblioteca);
	}
	@RequestMapping(value="/modificarBiblioteca", method=RequestMethod.PUT)
	public Response update(@RequestBody Biblioteca biblioteca) {
		
		return bibliotecaService.update(biblioteca);
	}
	@RequestMapping(value="/eliminarBiblioteca", method=RequestMethod.DELETE)
	public Response delete(@RequestBody Biblioteca biblioteca) {
		
		return bibliotecaService.delete(biblioteca);
	}
	
	@RequestMapping(value="/seleccionarTodasLasBibliotecas", method=RequestMethod.GET)
	public Response selectAll() {
		
		return bibliotecaService.selectAll();
	}
}
