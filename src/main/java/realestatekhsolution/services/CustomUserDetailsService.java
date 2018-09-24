
package realestatekhsolution.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import realestatekhsolution.models.oauth2.MyUserPrincipal;
import realestatekhsolution.models.SecUser;
import realestatekhsolution.repositories.UserRepository;


/**
 * Created by Rith on 9/23/2018.
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        SecUser user = usersRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincipal(user);
    }
}

