	package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="heroes")
public class heroes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	String nombre;
	String clase;
	int rango;
	String habilidad;
	String residencia;
	int Telefono;
	String imagen;
	
	
	public heroes(int id, String nombre, String clase, int rango, String habilidad, String residencia, int telefono,
			String imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clase = clase;
		this.rango = rango;
		this.habilidad = habilidad;
		this.residencia = residencia;
		Telefono = telefono;
		this.imagen = imagen;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public heroes(int id, String nombre, String clase, int rango, String habilidad, String residencia, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clase = clase;
		this.rango = rango;
		this.habilidad = habilidad;
		this.residencia = residencia;
		Telefono = telefono;
	}


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


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public int getRango() {
		return rango;
	}


	public void setRango(int rango) {
		this.rango = rango;
	}


	public String getHabilidad() {
		return habilidad;
	}


	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}


	public String getResidencia() {
		return residencia;
	}


	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}


	public int getTelefono() {
		return Telefono;
	}


	public void setTelefono(int telefono) {
		Telefono = telefono;
	}


	public heroes() {
		super();
	}
	
	
	
}
