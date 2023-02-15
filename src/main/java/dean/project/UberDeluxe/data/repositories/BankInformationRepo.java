package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.BankInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInformationRepo extends JpaRepository<BankInformation, Long> {
}
