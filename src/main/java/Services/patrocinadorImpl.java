package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.HeroesREPO;
import Repository.patrocinadorREPO;
import model.patrocinador;
@Service
public class patrocinadorImpl implements IpatrocinadorService{

	@Autowired
	patrocinadorREPO patrocinadorU;
	@Override
	public List<patrocinador> getAllpatrocinador() {
		// TODO Auto-generated method stub
		return patrocinadorU.findAll();
	}

	@Override
	public patrocinador getpatrocinadorById(int id) {
		// TODO Auto-generated method stub
		return patrocinadorU.findById(id);
	}

	@Override
	public void addpatrocinador(patrocinador patrocinador) {
		// TODO Auto-generated method stub
		patrocinadorU.save(patrocinador);
	}

	@Override
	public void updatepatrocinador(patrocinador patrocinador) {
		// TODO Auto-generated method stub
		patrocinadorU.save(patrocinador);
	}

	@Override
	public void deletepatrocinador(int Id) {
		// TODO Auto-generated method stub
		patrocinadorU.deleteById(Id);		
	}

	@Override
	public List<patrocinador> getpatrocinadorbyNombre(String Nombre) {
		// TODO Auto-generated method stub
		return null;
	}


}
