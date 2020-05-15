package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.patrocinioHeroe;
@Repository
public interface PatrocinioHeroeREPO  extends JpaRepository<patrocinioHeroe, Integer> {
	patrocinioHeroe findById(int Id);


}

