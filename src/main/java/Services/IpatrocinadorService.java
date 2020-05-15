package Services;

import java.util.List;

import model.patrocinador;

public interface IpatrocinadorService {
	List<patrocinador> getAllpatrocinador();
	patrocinador getpatrocinadorById(int id);
	void addpatrocinador(patrocinador patrocinador);
	void updatepatrocinador(patrocinador patrocinador);
	void deletepatrocinador(int Id);
	List<patrocinador> getpatrocinadorbyNombre(String Nombre);

}
