package com.ite.productosJPA.modelo.dao;

import java.util.List;

import com.ite.productosJPA.modelo.beans.Producto;

public interface IntProductoDao {
	
	int insertarProducto(Producto producto);
	Producto buscarUno(int codigo);
	List<Producto> buscarTodos(); 
	List<Producto> buscarPorFamilia(int codigoFamilia); 
	List<Producto> buscarPorMarcayColor(String marca,String color); 

}
