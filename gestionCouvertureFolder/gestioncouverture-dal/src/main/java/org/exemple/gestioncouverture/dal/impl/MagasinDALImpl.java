package org.exemple.gestioncouverture.dal.impl;

import org.exemple.gestioncouverture.dal.MagasinDAL;
import org.exemple.gestioncouverture.dal.repository.MagasinRepository;
import org.exemple.gestioncouverture.model.Magasin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MagasinDALImpl implements MagasinDAL {
    private final MagasinRepository magasinRepository;

    @Autowired
    public MagasinDALImpl(MagasinRepository magasinRepository) {
        this.magasinRepository= magasinRepository;
    }
    @Override
    public void addMagasin(Magasin magasin) {
     magasinRepository.save(magasin);
    }

    @Override
    public List<Magasin> getAllMagasin() {
        return magasinRepository.findAll();
    }

    @Override
    public Magasin findMagasinByMagasinName(String magasinName) {
        return magasinRepository.findUtilisateurByUserName(magasinName);
    }
}
