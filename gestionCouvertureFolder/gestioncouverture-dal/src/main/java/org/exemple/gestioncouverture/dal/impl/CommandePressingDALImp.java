package org.exemple.gestioncouverture.dal.impl;

import org.exemple.gestioncouverture.dal.CommandePressingDAL;
import org.exemple.gestioncouverture.dal.repository.CommandePressingRepository;
import org.exemple.gestioncouverture.model.CommandePressing;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommandePressingDALImp implements CommandePressingDAL {
    private final CommandePressingRepository commandePressingRepository;

    @Autowired
    public CommandePressingDALImp(CommandePressingRepository commandePressingRepository) {
        this.commandePressingRepository = commandePressingRepository;
    }
    @Override
    public void addCommendePressing(CommandePressing commandePressing) {
        commandePressingRepository.save(commandePressing);
    }

    @Override
    public List<CommandePressing> getAllCommendePressing() {
        return commandePressingRepository.findAll();
    }

    @Override
    public CommandePressing findCommendePressingByCommendePressingName(String commandePressingName) {
        return commandePressingRepository.findCommandePressingByCommandePressingRepositoryName(commandePressingName);
    }
}
