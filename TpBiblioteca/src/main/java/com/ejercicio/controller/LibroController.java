package com.ejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.entity.Libro;
import com.ejercicio.entity.Response;
import com.ejercicio.service.LibroService;

@RestController
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	@RequestMapping(value = "/nuevoLibro", method = RequestMethod.POST)
	public Response insertLibro(@RequestBody Libro libro) {
		
		return libroService.insert(libro);
	}
	@RequestMapping(value = "/deleteLibro", method = RequestMethod.DELETE)
	public Response deleteLibro(@RequestBody Libro libro) {
	
		return libroService.delete(libro);
	}
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public Response selectAll() {
	
		return libroService.selectAll();
	}
	@RequestMapping(value = "/modificarLibro", method = RequestMethod.PUT)
	public Response updateLibro(@RequestBody Libro libro) {
	
		return libroService.update(libro);
	}
	}
