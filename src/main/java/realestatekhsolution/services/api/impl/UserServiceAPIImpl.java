
package realestatekhsolution.services.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realestatekhsolution.models.SecUser;
import realestatekhsolution.repositories.UserRepository;
import realestatekhsolution.services.api.UserServiceAPI;

import java.util.List;


/**
 * Created by Rith on 8/15/2018.
 */

@Service
public class UserServiceAPIImpl implements UserServiceAPI {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<SecUser> list() {
        return (List<SecUser>) userRepository.findAll();
    }

    @Override
    public SecUser findByName(String username) {
        return  userRepository.findByName(username);
    }
}

