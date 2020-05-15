package Services;

import java.util.List;

import model.patrocinioHeroe;

public interface IpatrocinioHeroeService {
	List<patrocinioHeroe> getAllpatrocinioHeroe();
	patrocinioHeroe getHeroeById(int id);
	void addHeroe(patrocinioHeroe patrocinioHeroe);
	void updateHeroe(patrocinioHeroe patrocinioHeroe);
	void deleteHeroe(int Id);
	List<patrocinioHeroe> getpatrocinioHeroebyNombre(String Nombre);

}
