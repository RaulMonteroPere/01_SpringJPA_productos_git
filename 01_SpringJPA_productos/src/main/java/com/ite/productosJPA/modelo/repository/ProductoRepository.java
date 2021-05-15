package com.ite.productosJPA.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ite.productosJPA.modelo.beans.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	public List<Producto> findByColorAndMarca(String color, String marca);
	
	@Query("select p from Producto p where p.familia.codigo=?1")
	public List<Producto> findPorFamilia(int codigo);

}
