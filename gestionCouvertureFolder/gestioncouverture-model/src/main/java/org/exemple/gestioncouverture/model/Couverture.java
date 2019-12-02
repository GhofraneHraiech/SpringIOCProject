/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ghofrane
 */
@Entity
@Table(name = "Couverture")
public class Couverture implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long id;
    private String etat;
    private String type;
    private String color;
    private long idMagasinier;
    private long idMagasin;
    private long idDepartement;
    private long idCommandePressing;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getIdMagasinier() {
        return idMagasinier;
    }

    public void setIdMagasinier(long idMagasinier) {
        this.idMagasinier = idMagasinier;
    }

    public long getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(long idMagasin) {
        this.idMagasin = idMagasin;
    }

    public long getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public long getIdCommandePressing() {
        return idCommandePressing;
    }

    public void setIdCommandePressing(long idCommandePressing) {
        this.idCommandePressing = idCommandePressing;
    }
}
