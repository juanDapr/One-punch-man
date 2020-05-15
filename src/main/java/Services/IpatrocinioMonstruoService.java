package Services;

import java.util.List;

import model.patrocinioMonstruo;

public interface IpatrocinioMonstruoService {
	List<patrocinioMonstruo> getAllpatrocinioMonstruo();
	patrocinioMonstruo getHeroeById(int id);
	void addHeroe(patrocinioMonstruo patrocinioMonstruo);
	void updateHeroe(patrocinioMonstruo patrocinioMonstruo);
	void deleteHeroe(int Id);
	List<patrocinioMonstruo> getpatrocinioMonstruobyNombre(String Nombre);

}
