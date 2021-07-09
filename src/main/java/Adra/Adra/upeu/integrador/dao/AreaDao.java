package Adra.Adra.upeu.integrador.dao;

import java.util.List;

import Adra.Adra.upeu.integrador.entity.Area;

public interface AreaDao {
	int insertar(String nombre);
	List<Area> listar();
	List<Area> buscar(int id);
	
}
