package com.devpredator.practicajpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.devpredator.practicajpa.dao.RestauranteDAO;
import com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl;
import com.devpredator.practicajpa.entity.Menu;
import com.devpredator.practicajpa.entity.Restaurante;
import com.devpredator.practicajpa.entity.TipoRestaurante;

class RestauranteDAOImplTest {

private RestauranteDAO restauranteDAO= new RestauranteDAOImpl();

	@Test
	void testGuardar() {
		Restaurante restaurante = new Restaurante();
		Menu menu = new Menu();
		TipoRestaurante resttipo = new TipoRestaurante();

		restaurante.setNombre("El taco grande");
		restaurante.setImagen("taco.png");
		restaurante.setSlogan("Vamos");
		restaurante.setFechaCreacion(LocalDateTime.now());
		restaurante.setFechaModicicacion(LocalDateTime.now());
		restaurante.setEstatus(true);

		menu.setClave("Chido_menu");
		menu.setDescripcion("Menu el taco");
		menu.setFechaCreacion(LocalDateTime.now());
		menu.setFechaModicicacion(LocalDateTime.now());
		menu.setEstatus(true);

		resttipo.setDescripcion("Mexicano");
		resttipo.setFechaCreacion(LocalDateTime.now());
		resttipo.setFechaModicicacion(LocalDateTime.now());
		resttipo.setEstatus(true);

		restaurante.setMenu(menu);
		restaurante.setTipoRestaurante(resttipo);

		this.restauranteDAO.guardar(restaurante);

	}

	@Test
	void testActualizar() {
		Restaurante restaurante = new Restaurante();
		Menu menu = new Menu();
		TipoRestaurante resttipo = new TipoRestaurante();
      
		
		restaurante.setNombre("El taco mas grande");
//		restaurante.setImagen("taco.png");
//		restaurante.setSlogan("Vamos");
		restaurante.setFechaCreacion(LocalDateTime.now());
		restaurante.setFechaModicicacion(LocalDateTime.now());
//		restaurante.setEstatus(true);

//		menu.setClave("Chido_menu");
//		menu.setDescripcion("Menu el taco");
//		menu.setFechaCreacion(LocalDateTime.now());
//		menu.setFechaModicicacion(LocalDateTime.now());
//		menu.setEstatus(true);
        
		resttipo.setIdTipoRestaurante(16);
//		resttipo.setDescripcion("Mexicano");
//		resttipo.setFechaCreacion(LocalDateTime.now());
//		resttipo.setFechaModicicacion(LocalDateTime.now());
//		resttipo.setEstatus(true);
//
//		restaurante.setMenu(menu);
		restaurante.setTipoRestaurante(resttipo);
	
		this.restauranteDAO.actualizar(restaurante);
	}

	@Test
	void testEliminar() {
		this.restauranteDAO.eliminar(14L);
	}

	@Test
	void testConsultar() {
		List<Restaurante> lista= this.restauranteDAO.consultar();
		  lista.forEach(c->  System.out.println(c.getNombre()));
		
	}

}
