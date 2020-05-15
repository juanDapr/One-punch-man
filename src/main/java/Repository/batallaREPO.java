package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.batalla;

@Repository
public interface batallaREPO extends JpaRepository<batalla, Integer>{
	batalla findById(int Id);

}
