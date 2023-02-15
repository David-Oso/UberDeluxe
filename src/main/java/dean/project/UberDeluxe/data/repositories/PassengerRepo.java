package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
}
