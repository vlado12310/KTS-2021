package uns.ac.rs.ftn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import uns.ac.rs.ftn.model.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {

}
