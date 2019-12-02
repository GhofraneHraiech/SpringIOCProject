package org.exemple.gestioncouverture.business;

import java.util.List;
import org.exemple.gestioncouverture.model.User;

/**
 * Hello world!
 *
 */
public interface UserBusiness {

    void addUser(User user);

    List<User> getAllUsers();
}
