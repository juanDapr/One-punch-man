package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batalla")
public class batalla {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	int idMonstruo;
	int idHeroe;
	String ganador;

	public batalla() {
		super();
	}
	public batalla(int id, int idMonstruo, int idHeroe, String ganador) {
		super();
		this.id = id;
		this.idMonstruo = idMonstruo;
		this.idHeroe = idHeroe;
		this.ganador = ganador;
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
	public int getIdHeroe() {
		return idHeroe;
	}
	public void setIdHeroe(int idHeroe) {
		this.idHeroe = idHeroe;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

}
