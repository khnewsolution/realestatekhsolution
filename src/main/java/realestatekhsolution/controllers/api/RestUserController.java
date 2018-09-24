
package realestatekhsolution.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import realestatekhsolution.models.SecUser;
import realestatekhsolution.services.api.UserServiceAPI;

import java.util.List;


/**
 * Created by Rith on 8/15/2018.
 */

@RestController
public class RestUserController {
    @Autowired
    public UserServiceAPI userServiceAPI;

    @RequestMapping(value = "/users",method = {RequestMethod.GET, RequestMethod.POST})
    public List<SecUser> getAllUsers(){
        return (List<SecUser>) userServiceAPI.list();
    }
}

