package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategorieDeProduit {
    @Id
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "categorie")
    private Set<Produit> produits;
}
