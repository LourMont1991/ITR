package com.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.entity.Genero;
import com.ejercicio.entity.Response;
import com.ejercicio.service.GeneroService;

@RestController
public class GeneroController {
	
	@Autowired
	private GeneroService generoService;
	
	@RequestMapping(value = "/nuevoGenero", method = RequestMethod.POST)
	public Response insertGenero(@RequestBody Genero genero) {
		
		return generoService.insert(genero);
	}

	@RequestMapping(value = "/deleteGenero", method = RequestMethod.DELETE)
	public Response delete(@RequestBody Genero genero) {
		
		return generoService.delete(genero);
	}
	@RequestMapping(value = "/modificarGenero", method = RequestMethod.PUT)
	public Response update(@RequestBody Genero genero) {
		
		return generoService.update(genero);
	}
	@RequestMapping(value = "/seleccionarTodosLosGeneros", method = RequestMethod.GET)
	public Response selectAll() {
		
		return generoService.selectAll();
	}

}
