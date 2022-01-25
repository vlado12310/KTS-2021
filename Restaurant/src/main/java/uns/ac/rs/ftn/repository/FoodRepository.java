package uns.ac.rs.ftn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uns.ac.rs.ftn.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
