package com.ejercicio.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ejercicio.entity.Biblioteca;

@Mapper
public interface BibliotecaMapper {

	void insert(@Param(value = "biblioteca") Biblioteca biblioteca );
	
	void update(@Param(value = "biblioteca") Biblioteca biblioteca );

	void delete(@Param(value = "biblioteca") Biblioteca biblioteca );
	
	List<Biblioteca> selectAll();
}
