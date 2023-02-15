package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepo extends JpaRepository<CreditCard, Long> {
}
