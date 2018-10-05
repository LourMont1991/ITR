package com.ejercicio.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.entity.Genero;
import com.ejercicio.entity.Response;
import com.ejercicio.mappers.GeneroMapper;

@Service
public class GeneroService {

	@Autowired
	private GeneroMapper generoMapper;

	@Autowired
	private Response response;
	
	private LocalDate fecha; 
	public Response insert(Genero genero) {
		
		
		if (genero.getNombre().length() <= 15) {
			generoMapper.insert(genero);
			response.setMessage("Se inserto el objeto");
			
			System.out.println( "Fecha " + LocalDate.now() + " " + response.getMessage());
			return response;
		}
		response.setMessage("El nombre ingresaso no es valido");
		return response;
	}
	public Response delete(Genero genero) {

		try {
			generoMapper.delete(genero);
			response.setMessage("Se elimino el objeto");
			return response;
			
		} catch (Exception e) {
			 
		response.setMessage("No se puedo eliminar el objeto");
		return response;
		}
	}

	public Response update(Genero genero) {

		if (genero.getNombre().length() <= 15) {
			generoMapper.update(genero);
			response.setMessage("Se modifico el objeto");
			return response;
		}
		response.setMessage("El nombre ingresaso no es valido");
		return response;
	}
	public Response selectAll() {

		response.setData(generoMapper.selectAll());
		
		return response;
	}
}
