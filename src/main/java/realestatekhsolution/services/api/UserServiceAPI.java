
package realestatekhsolution.services.api;

import realestatekhsolution.models.SecUser;

import java.util.List;


/**
 * Created by Rith on 8/15/2018.
 */

public interface UserServiceAPI {
    List<SecUser> list();
    SecUser findByName(String username);
}

