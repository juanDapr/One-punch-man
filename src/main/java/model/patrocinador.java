package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patrocinador")
public class patrocinador {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	int nit;
	String nombre;
	String logo;
	


	public patrocinador(int id, int nit, String nombre, String logo) {
		super();
		this.id = id;
		this.nit = nit;
		this.nombre = nombre;
		this.logo = logo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public int getNit() {
	return nit;
}
public void setNit(int nit) {
	this.nit = nit;
}
	public patrocinador() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
