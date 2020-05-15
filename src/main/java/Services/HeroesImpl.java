package Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.HeroesREPO;
import model.heroes;



@Service
public class HeroesImpl implements IHeroesService {
	@Autowired
	HeroesREPO Heroe;

	@Override
	public List<heroes> getAllHeroees() {
		// TODO Auto-generated method stub
		return Heroe.findAll();
	}

	@Override
	public heroes getHeroeById(int empId) {
		// TODO Auto-generated method stub
		return Heroe.findById(empId);
	}

	@Override
	public void addHeroe(heroes Heroees) {
		// TODO Auto-generated method stub
		Heroe.save(Heroees);
	}

	@Override
	public void updateHeroe(heroes Heroees) {
		// TODO Auto-generated method stub
		Heroe.save(Heroees);
		
	}

	@Override
	public void deleteHeroe(int Id) {
		// TODO Auto-generated method stub
		Heroe.deleteById(Id);
	}

	@Override
	public List<heroes> getHeroebyNombre(String Nombre) {
		// TODO Auto-generated method stub
		return Heroe.findBynombre(Nombre);
	}

	@Override
	public List<heroes> getHeroebyrango(int rango) {
		// TODO Auto-generated method stub
		return Heroe.findByRango(rango);
	}
	
	

	

}
