package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.patrocinador;
@Repository
public interface patrocinadorREPO extends JpaRepository<patrocinador, Integer> {
	patrocinador findById(int Id);
	List<patrocinador> findBynombre(String nombre);
}
