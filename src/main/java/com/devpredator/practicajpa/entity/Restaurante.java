/**
 * 
 */
package com.devpredator.practicajpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author 4PF28LA_2004
 *
 */
@Entity
@Table(name = "restaurante")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRestaurante")
	private int idRestaurante;
	
	private String nombre;
	
	private String imagen;
	
	private String slogan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoRestaurante")
	@Cascade(CascadeType.ALL)
	private TipoRestaurante tipoRestaurante;
	
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModicicacion;
	
	@Column(name = "estatus")
	private boolean estatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMenu")
	@Cascade(CascadeType.ALL)
	private Menu menu;

	/**
	 * @return the idRestaurante
	 */
	public int getIdRestaurante() {
		return idRestaurante;
	}

	/**
	 * @param idRestaurante the idRestaurante to set
	 */
	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	/**
	 * @return the tipoRestaurante
	 */
	public TipoRestaurante getTipoRestaurante() {
		return tipoRestaurante;
	}

	/**
	 * @param tipoRestaurante the tipoRestaurante to set
	 */
	public void setTipoRestaurante(TipoRestaurante tipoRestaurante) {
		this.tipoRestaurante = tipoRestaurante;
	}


	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModicicacion
	 */
	public LocalDateTime getFechaModicicacion() {
		return fechaModicicacion;
	}

	/**
	 * @param fechaModicicacion the fechaModicicacion to set
	 */
	public void setFechaModicicacion(LocalDateTime fechaModicicacion) {
		this.fechaModicicacion = fechaModicicacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
	
	
}
