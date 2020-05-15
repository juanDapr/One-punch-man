package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.fan;
@Repository
public interface fanREPO extends JpaRepository<fan, Integer> {
	fan findById(int Id);
	List<fan> findBynombre(String nombre);

}
