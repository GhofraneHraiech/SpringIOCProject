/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.dal;

import org.exemple.gestioncouverture.model.CommandePressing;

import java.util.List;

/**
 *
 * @author ghofrane
 */
public interface CommandePressingDAL {
    void addCommendePressing(CommandePressing commandePressing);

    List<CommandePressing> getAllCommendePressing();

    CommandePressing findCommendePressingByCommendePressingName(String commandePressingName);

}
