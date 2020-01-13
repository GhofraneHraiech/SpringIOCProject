/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal;

import org.exemple.gestioncouverture.model.Magasin;

import java.util.List;

/**
 *
 * @author ghofrane
 */
public interface MagasinDAL {
    void addMagasin(Magasin magasin);

    List<Magasin> getAllMagasin();

    Magasin findMagasinByMagasinName(String MagasinName);

    
}
