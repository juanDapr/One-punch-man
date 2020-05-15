package Services;

import java.util.List;

import model.batalla;

public interface IbatallaService {
	List<batalla> getAllbatalla();
	batalla getHeroeById(int id);
	void addHeroe(batalla batalla);
	void updateHeroe(batalla batalla);
	void deleteHeroe(int Id);
	List<batalla> getBatallabyNombre(String Nombre);
}
