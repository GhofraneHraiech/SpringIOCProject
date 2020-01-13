/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal.impl;

import java.util.List;
import org.exemple.gestioncouverture.dal.UserDAL;
import org.exemple.gestioncouverture.dal.repository.UserRepository;
import org.exemple.gestioncouverture.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ghofrane
 */
@Repository
public class UserDALImp implements UserDAL {

    private final UserRepository userRepository;

    @Autowired
    public UserDALImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
            return userRepository.findAll();    }

    @Override
    public User findUserByUserName(String userName) {
return userRepository.findUtilisateurByUserName(userName);    }

    @Override
    public void saveUser(User user) {
userRepository.save(user);    }

}
