package dean.project.UberDeluxe.data.repositories;

import dean.project.UberDeluxe.data.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepo extends JpaRepository<Review, Long> {

}
