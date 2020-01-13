/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal;

import org.exemple.gestioncouverture.model.Couverture;

import java.util.List;

/**
 *
 * @author ghofrane
 */
public interface CouvertureDAL {
    void addCouverture(Couverture couverture);

    List<Couverture> getAllCouverture();

    Couverture findCouvertureByCouvertureName(String couvertureName);

}
