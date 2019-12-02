/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.exemple.gestioncouverture.business.UserBusiness;
import org.exemple.gestioncouverture.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author ghofrane
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
        private UserBusiness userBusiness;

    @GET
    @Path("User")
    public List<User> getAllUser() {
        return userBusiness.getAllUsers() ;

    }
}
