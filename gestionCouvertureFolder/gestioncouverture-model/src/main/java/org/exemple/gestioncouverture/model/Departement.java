package org.exemple.gestioncouverture.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Hello world!
 *
 */
@Entity
@Table(name = "Departement")
public class Departement implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private long id;
    private String name;
    private long quantiteNecessaire;
    @ManyToOne
    private long idMagasinier;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantiteNecessaire() {
        return quantiteNecessaire;
    }

    public void setQuantiteNecessaire(long quantiteNecessaire) {
        this.quantiteNecessaire = quantiteNecessaire;
    }

    public long getIdMagasinier() {
        return idMagasinier;
    }

    public void setIdMagasinier(long idMagasinier) {
        this.idMagasinier = idMagasinier;
    }
}
