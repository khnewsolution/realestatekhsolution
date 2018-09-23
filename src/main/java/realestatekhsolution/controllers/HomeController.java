package realestatekhsolution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rith on 9/23/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String goHome(){
        return "home";
    }
}
