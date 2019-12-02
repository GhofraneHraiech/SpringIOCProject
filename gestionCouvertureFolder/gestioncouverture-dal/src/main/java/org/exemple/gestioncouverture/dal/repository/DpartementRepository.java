/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal.repository;

import org.exemple.gestioncouverture.model.Departement;

/**
 *
 * @author ghofrane
 */
public interface DpartementRepository {
           Departement findUtilisateurByUserName(String fisrtName);

}
