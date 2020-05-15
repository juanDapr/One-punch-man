package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patrocinioHeroe")
public class patrocinioHeroe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	int idHeroe;
	int idPatrocinador;


	public patrocinioHeroe() {
		super();
	}
	public patrocinioHeroe(int id, int idHeroe, int idPatrocinador) {
		super();
		this.id = id;
		this.idHeroe = idHeroe;
		this.idPatrocinador = idPatrocinador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdHeroe() {
		return idHeroe;
	}
	public void setIdHeroe(int idHeroe) {
		this.idHeroe = idHeroe;
	}
	public int getIdPatrocinador() {
		return idPatrocinador;
	}
	public void setIdPatrocinador(int idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}


}
