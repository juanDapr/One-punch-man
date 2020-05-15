package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.patrocinioMonstruo;
@Repository
public interface patrocinioMonstruoREPO  extends JpaRepository<patrocinioMonstruo, Integer> {
	patrocinioMonstruo findById(int Id);


}
