package com.ejercicio.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ejercicio.entity.Genero;

@Mapper
public interface GeneroMapper {

	void insert(@Param(value = "genero") Genero genero );
	
	void delete(@Param(value = "genero") Genero genero );
	
	void update(@Param(value = "genero") Genero genero );
	
	List<Genero> selectAll();
}
