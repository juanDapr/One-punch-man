package Services;

import java.util.List;

import model.fan;

public interface IfanService {
	List<fan> getAllfan();
	fan getHeroeById(int id);
	void addHeroe(fan fan);
	void updateHeroe(fan fan);
	void deleteHeroe(int Id);
	List<fan> getfanbyNombre(String Nombre);

}
