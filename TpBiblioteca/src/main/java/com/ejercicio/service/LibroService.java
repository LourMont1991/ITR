package com.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.entity.Libro;
import com.ejercicio.entity.Response;
import com.ejercicio.mappers.LibroMapper;

@Service
public class LibroService {

	@Autowired
	private LibroMapper libroMapper;

	@Autowired
	private Response respuesta;

	public Response insert(Libro libro) {
		if (libro.getNombre().length() <= 15) {

			libroMapper.insert(libro);
			respuesta.setMessage("Se inserto el objeto");
			return respuesta;

		} else
			respuesta.setMessage("El nombre ingresado no es valido");

		return respuesta;
	}

	public Response delete(Libro libro) {
		libroMapper.deleteLibro(libro);
		
		return respuesta;
	}

	public Response update(Libro libro) {

		if (libro.getNombre().length() <= 15) {
			libroMapper.update(libro);
			respuesta.setMessage("Se modifico el objeto");
			return respuesta;

		} else
			respuesta.setMessage("El nombre ingresado no es valido");
		return respuesta;
	}

	public Response selectAll() {

		respuesta.setData(libroMapper.selectAll());
		return respuesta;
	}
}
