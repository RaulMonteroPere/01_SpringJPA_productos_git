package com.ite.productosJPA.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ite.productosJPA.modelo.beans.Producto;
import com.ite.productosJPA.modelo.repository.ProductoRepository;
@Service
public class ProductoDaoImpl implements IntProductoDao {
	@Autowired
	ProductoRepository prepo;
	
	@Override
	public int insertarProducto(Producto producto) {
		int filas=0;
		try {
			prepo.save(producto);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Producto buscarUno(int codigo) {
		
		return prepo.findById(codigo).orElse(null);
	}

	@Override
	public List<Producto> buscarTodos() {
		
		return prepo.findAll();
	}

	@Override
	public List<Producto> buscarPorFamilia(int codigoFamilia) {
		
		return prepo.findPorFamilia(codigoFamilia);
	}

	@Override
	public List<Producto> buscarPorMarcayColor(String marca, String color) {
		
		return prepo.findByColorAndMarca(marca, color);
	}

}
