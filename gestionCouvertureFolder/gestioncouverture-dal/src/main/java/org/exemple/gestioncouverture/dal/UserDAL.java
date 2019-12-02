package org.exemple.gestioncouverture.dal;

import java.util.List;
import org.exemple.gestioncouverture.model.User;

/**
 * Hello world!
 *
 */
public interface UserDAL {

    /**
     *
     * @param user
     */
    void addUser(User user);

    List<User> getAllUser();

    User findUserByUserName(String userName);

    void saveUser(User user);

}
