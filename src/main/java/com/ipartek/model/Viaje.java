package com.ipartek.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * @author Alain
 * @version 1.0
 * 
 * <p>Clase Viajes</p>
 * <p>Clase DTO generada con Hybernate para represntar la tabla que creara en
 * la BD</p>
 * 
 */
@Entity
@Table(name="viajes")
public class Viaje {


	/**
	 * Atributo Id: admite valores numericos, pero al insertar un 
	 * viaje nuevo en la BD se le asignara el valor automaticamente
	 * 
	 * al hacer una modificacion, deberemos añadirle el valor del id delç
	 * objeto a modificar....
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	/**
	 * Atributo Nombre: describimos lo que tiene el atributo nombre
	 */
	@Column(name="id")
	private String nombre;
	
	
	@Column(name="id")
	private int precio;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public Viaje(int id, String nombre, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Viaje() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0;
	}


	@Override
	public String toString() {
		return "Viaje [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
