package com.ite.productosJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ite.productosJPA.modelo.beans.Producto;
import com.ite.productosJPA.modelo.dao.IntProductoDao;

@Controller
@RequestMapping("/producto")
public class ProductosJpaController {
	@Autowired
	IntProductoDao pdao;
	
	@GetMapping("/index")
	public String inicio(Model model) {
		model.addAttribute("mensaje","Raul Montero");
		
		return "index";
		
	}
	@GetMapping("/verUno/{id}")
	public String verUno(Model model, @PathVariable(name="id") int codigo) {
		Producto producto=pdao.buscarUno(codigo);
		model.addAttribute("producto",producto);
		return "verProducto";
	}
	@GetMapping("/verTodos")
	public String verTodos(Model model) {
		List<Producto> lista=pdao.buscarTodos();
		model.addAttribute("lista",lista);
		return "listaProductos";
	}

}
