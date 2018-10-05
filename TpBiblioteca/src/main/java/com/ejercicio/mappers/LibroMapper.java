package com.ejercicio.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.ejercicio.entity.Libro;

@Mapper
public interface LibroMapper {
	

	void insert(@Param(value = "libro") Libro libro );
	
	void deleteLibro(@Param(value = "libro") Libro libro);
	
	List<Libro> selectAll();
	
	void update(@Param(value = "libro") Libro libro);

}
