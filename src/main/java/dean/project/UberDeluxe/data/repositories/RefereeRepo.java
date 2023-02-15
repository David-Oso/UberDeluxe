package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.Referee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefereeRepo extends JpaRepository<Referee, Long> {
}
