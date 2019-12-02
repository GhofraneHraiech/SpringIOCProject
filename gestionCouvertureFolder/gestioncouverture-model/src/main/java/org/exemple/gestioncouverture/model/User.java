/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.exemple.gestioncouverture.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ghofrane
 */
@Entity
@Table(name="User")
public class User implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long id;
    private String status;
    private String firstName;
    private String lastName;
    @OneToMany
    private Collection<Magasin> magasin;

    public Collection<Magasin> getMagasin() {
        return magasin;
    }

    public void setMagasin(Collection<Magasin> magasin) {
        this.magasin = magasin;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "status=" + status + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.magasin, other.magasin);
    }

    
    
}
