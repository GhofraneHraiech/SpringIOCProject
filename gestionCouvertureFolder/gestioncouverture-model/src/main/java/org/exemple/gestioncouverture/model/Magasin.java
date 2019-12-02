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
import javax.persistence.ManyToOne;

/**
 *
 * @author ghofrane
 */
@Entity
public class Magasin implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long id;
    private long capacity;
    @ManyToOne
    private Collection<User> user;

    public Collection<User> getUser() {
        return user;
    }

    public void setUser(Collection<User> user) {
        this.user = user;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", capacity=" + capacity + ", user=" + user + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Magasin other = (Magasin) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.capacity != other.capacity) {
            return false;
        }
        return Objects.equals(this.user, other.user);
    }
    
    
}
