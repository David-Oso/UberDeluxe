package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
