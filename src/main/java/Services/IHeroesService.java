package Services;

import java.util.List;

import model.heroes;


public interface IHeroesService {

	List<heroes> getAllHeroees();
	heroes getHeroeById(int empId);
	void addHeroe(heroes Heroees);
	void updateHeroe(heroes Heroees);
	void deleteHeroe(int Id);
	List<heroes> getHeroebyNombre(String Nombre);
	List<heroes> getHeroebyrango(int rango);
}
