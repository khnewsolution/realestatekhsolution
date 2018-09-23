package realestatekhsolution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
/**
 * Created by Rith on 8/8/2018.
 */
@Controller
public class DefaultController {
    @GetMapping("/admin")
    public String admin(Principal principal) {
        System.out.println("Hello admin");
        System.out.println(principal.getName());

        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }



}
