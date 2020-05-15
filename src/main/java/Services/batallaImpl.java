package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.batallaREPO;
import model.batalla;

@Service
public class batallaImpl implements IbatallaService {
	@Autowired
	batallaREPO fight;
	@Override
	public List<batalla> getAllbatalla() {
		// TODO Auto-generated method stub
		return fight.findAll();
	}

	@Override
	public batalla getHeroeById(int id) {
		// TODO Auto-generated method stub
		return fight.findById(id);
	}

	@Override
	public void addHeroe(batalla batalla) {
		// TODO Auto-generated method stub
		fight.save(batalla);
	}

	@Override
	public void updateHeroe(batalla batalla) {
		// TODO Auto-generated method stub
		fight.save(batalla);
	}

	@Override
	public void deleteHeroe(int Id) {
		// TODO Auto-generated method stub
		fight.deleteById(Id);
	}

	@Override
	public List<batalla> getBatallabyNombre(String Nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
