package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fanHeroe")
public class fanHeroe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	int idFan;
	int idHeroe;

	public fanHeroe() {
		super();
	}
	public fanHeroe(int id, int idFan, int idHeroe) {
		super();
		this.id = id;
		this.idFan = idFan;
		this.idHeroe = idHeroe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdFan() {
		return idFan;
	}
	public void setIdFan(int idFan) {
		this.idFan = idFan;
	}
	public int getIdHeroe() {
		return idHeroe;
	}
	public void setIdHeroe(int idHeroe) {
		this.idHeroe = idHeroe;
	}

}
