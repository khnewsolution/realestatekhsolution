package realestatekhsolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import realestatekhsolution.models.SecUser;

/**
 * Created by Rith on 9/23/2018.
 */

public interface UserRepository extends JpaRepository<SecUser, Integer> {
    SecUser findByName(String username);
}
