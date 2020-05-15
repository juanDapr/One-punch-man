package Services;

import java.util.List;

import model.monstruo;

public interface ImonstruoService {
	List<monstruo> getAllmonstruo();
	monstruo getHeroeById(int id);
	void addHeroe(monstruo monstruo);
	void updateHeroe(monstruo monstruo);
	void deleteHeroe(int Id);
	List<monstruo> getmonstruobyNombre(String Nombre);

}
