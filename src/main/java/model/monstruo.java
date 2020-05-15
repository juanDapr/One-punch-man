package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="monstruo")
public class monstruo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	String nombre;
	String nivelAmenaza;
	String imagen;
	
	
	
	
	public monstruo(int id, String nombre, String nivelAmenaza, String imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nivelAmenaza = nivelAmenaza;
		this.imagen = imagen;
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
	public String getNivelAmenaza() {
		return nivelAmenaza;
	}
	public void setNivelAmenaza(String nivelAmenaza) {
		this.nivelAmenaza = nivelAmenaza;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public monstruo() {
		super();
	}
	
	
	
}
