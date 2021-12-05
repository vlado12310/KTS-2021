package uns.ac.rs.ftn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uns.ac.rs.ftn.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    Authority findByName(String name);
}
