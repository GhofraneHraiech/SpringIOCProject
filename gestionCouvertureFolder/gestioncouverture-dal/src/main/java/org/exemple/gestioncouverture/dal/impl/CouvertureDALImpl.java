package org.exemple.gestioncouverture.dal.impl;

import org.exemple.gestioncouverture.dal.CouvertureDAL;
import org.exemple.gestioncouverture.dal.repository.CouvertureRepository;
import org.exemple.gestioncouverture.model.Couverture;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CouvertureDALImpl implements CouvertureDAL {
    private final CouvertureRepository couvertureRepository;

    @Autowired
    public CouvertureDALImpl(CouvertureRepository couvertureRepository) {
        this.couvertureRepository = couvertureRepository;
    }
    @Override
    public void addCouverture(Couverture couverture) {
        couvertureRepository.save(couverture);
    }

    @Override
    public List<Couverture> getAllCouverture() {
        return couvertureRepository.findAll();
    }

    @Override
    public Couverture findCouvertureByCouvertureName(String couvertureName) {
        return couvertureRepository.findUtilisateurByCouvertureName(couvertureName);
    }
}
