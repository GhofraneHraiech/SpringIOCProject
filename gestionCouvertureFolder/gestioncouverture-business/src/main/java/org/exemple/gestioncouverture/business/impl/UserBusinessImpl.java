/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.business.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.exemple.gestioncouverture.business.UserBusiness;
import org.exemple.gestioncouverture.model.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author ghofrane
 */
@Service
@Transactional
public class UserBusinessImpl implements UserBusiness{

    @Override
    public void addUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAllUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
