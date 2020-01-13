package org.exemple.gestioncouverture.dal.impl;

import org.exemple.gestioncouverture.dal.DepartementDAL;
import org.exemple.gestioncouverture.dal.repository.DepartementRepository;
import org.exemple.gestioncouverture.model.Departement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartementDALImp implements DepartementDAL {
    private final DepartementRepository departementRepository;

    @Autowired
    public DepartementDALImp(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }
    @Override
    public void addDepartement(Departement departement) {
departementRepository.save(departement);
    }

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement findDepartementByDepartementName(String departementName) {
        return departementRepository.findUtilisateurByUserName(departementName);
    }
}
