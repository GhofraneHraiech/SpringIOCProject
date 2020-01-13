/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 *
 * @author ghofrane
 */
@Document
public class CommandePressing implements Serializable {
    @Id
@Field(value = "id")
    private long id;
    @Field(value = "dateEnvoi")
    private Date dateEnvoi;
    @Field(value = "dateRetour")
    private Date dateRetour;
    @Field(value = "idMagasin")

    private long idMagasin;
    @Field(value = "etat")

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
