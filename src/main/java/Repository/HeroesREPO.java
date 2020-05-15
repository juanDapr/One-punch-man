package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.heroes;


@Repository
public interface HeroesREPO extends JpaRepository<heroes, Integer> {
	heroes findById(int Id);
	List<heroes> findBynombre(String nombre);
	List <heroes> findByRango(int rango);
	
}
