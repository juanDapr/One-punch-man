package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Repository.MonstruoREPO;
import model.monstruo;
@Service
public class monstruoImpl implements ImonstruoService {

	@Autowired
 MonstruoREPO villano;
	@Override
	public List<monstruo> getAllmonstruo() {
		// TODO Auto-generated method stub
		return villano.findAll();
	}

	@Override
	public monstruo getHeroeById(int id) {
		// TODO Auto-generated method stub
		return villano.findById(id);
	}

	@Override
	public void addHeroe(monstruo monstruo) {
		// TODO Auto-generated method stub
		villano.save(monstruo);
	}

	@Override
	public void updateHeroe(monstruo monstruo) {
		// TODO Auto-generated method stub
		villano.save(monstruo);
	}

	@Override
	public void deleteHeroe(int Id) {
		// TODO Auto-generated method stub
		villano.deleteById(Id);
	}

	@Override
	public List<monstruo> getmonstruobyNombre(String Nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
