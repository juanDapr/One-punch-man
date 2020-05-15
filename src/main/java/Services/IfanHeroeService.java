package Services;

import java.util.List;

import model.fanHeroe;

public interface IfanHeroeService {
	List<fanHeroe> getAllfanHeroe();
	fanHeroe getHeroeById(int id);
	void addHeroe(fanHeroe fanHeroe);
	void updateHeroe(fanHeroe fanHeroe);
	void deleteHeroe(int Id);
	List<fanHeroe> getfanHeroebyNombre(String Nombre);

}
