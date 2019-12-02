/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal.repository;

import org.exemple.gestioncouverture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author ghofrane
 */
public interface UserRepository extends JpaRepository <User, Long>{
        User findUtilisateurByUserName(String fisrtName);

}
