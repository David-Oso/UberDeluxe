package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<Details, Long> {
}
