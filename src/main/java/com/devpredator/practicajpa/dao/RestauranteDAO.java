/**
 * 
 */
package com.devpredator.practicajpa.dao;

import java.util.List;

import org.ietf.jgss.Oid;

import com.devpredator.practicajpa.entity.Restaurante;

/**
 * @author 4PF28LA_2004
 *
 */
public interface RestauranteDAO {
	
	public void guardar(Restaurante restaurante);
	
	public void actualizar(Restaurante restaurante);
	
	public void eliminar(Long id);
	
	public List<Restaurante> consultar();
	

}
