/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal.repository;

import org.exemple.gestioncouverture.model.CommandePressing;

/**
 *
 * @author ghofrane
 */
public interface CommandePressingRepository {
            CommandePressing findUtilisateurById(long id);

    
}
