package com.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.entity.Biblioteca;
import com.ejercicio.entity.Response;
import com.ejercicio.mappers.BibliotecaMapper;

@Service
public class BibliotecaService {

	@Autowired
	private BibliotecaMapper bibliotecaMapper;

	@Autowired
	private Response response;

	public Response insert(Biblioteca biblioteca) {
		if (biblioteca.getNombre().length() <= 15 && biblioteca.getDireccion().length() <= 15
				&& biblioteca.getTelefono().toString().length() <= 15) {

			bibliotecaMapper.insert(biblioteca);
			response.setMessage("Se inserto el objeto");
			return response;

		} else
			response.setMessage("El nombre ingresado no es valido");

		return response;

	}

	public Response update(Biblioteca biblioteca) {
		if (biblioteca.getNombre().length() <= 15 && biblioteca.getDireccion().length() <= 15
			&& biblioteca.getTelefono().toString().length() <= 15) {
				
			bibliotecaMapper.update(biblioteca);
			response.setMessage("Se modifico el objeto");
			return response;

		} else
			response.setMessage("El nombre ingresado no es valido");

		return response;

	}
	public Response delete(Biblioteca biblioteca) {

		try {
			bibliotecaMapper.delete(biblioteca);
			response.setMessage("Se elimino el objeto");
			return response;
			
		} catch (Exception e) {
			 
		response.setMessage("No se puedo eliminar el objeto");
		return response;
		}
	}
	public Response selectAll() {

		response.setData(bibliotecaMapper.selectAll());
		
		return response;
	}

}
