package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
