package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.monstruo;
@Repository
public interface MonstruoREPO extends JpaRepository<monstruo, Integer> {
	monstruo findById(int Id);
	List<monstruo> findBynombre(String nombre);
}
