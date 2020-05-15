package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patrocinioMonstruo")
public class patrocinioMonstruo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	int idMonstruo;
	int idPatrocinador;

	public patrocinioMonstruo() {
		super();
	}
	public patrocinioMonstruo(int id, int idMonstruo, int idPatrocinador) {
		super();
		this.id = id;
		this.idMonstruo = idMonstruo;
		this.idPatrocinador = idPatrocinador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdMonstruo() {
		return idMonstruo;
	}
	public void setIdMonstruo(int idMonstruo) {
		this.idMonstruo = idMonstruo;
	}
	public int getIdPatrocinador() {
		return idPatrocinador;
	}
	public void setIdPatrocinador(int idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}

}
