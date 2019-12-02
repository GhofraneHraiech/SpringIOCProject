/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ghofrane
 */
@Entity
@Table(name = "CommandePressing")
public class CommandePressing implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEnvoi;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateRetour;
    private long idMagasin;
    private String etat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public long getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(long idMagasin) {
        this.idMagasin = idMagasin;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "CommandePressing{" + "id=" + id + ", dateEnvoi=" + dateEnvoi + ", dateRetour=" + dateRetour + ", idMagasin=" + idMagasin + ", etat=" + etat + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CommandePressing other = (CommandePressing) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idMagasin != other.idMagasin) {
            return false;
        }
        if (!Objects.equals(this.etat, other.etat)) {
            return false;
        }
        if (!Objects.equals(this.dateEnvoi, other.dateEnvoi)) {
            return false;
        }
        return Objects.equals(this.dateRetour, other.dateRetour);
    }
    
    
}
