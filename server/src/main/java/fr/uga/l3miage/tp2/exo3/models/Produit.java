package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produit {
    @Id
    private Long id;

    private String nom;
    private Double prix;
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Commande commande;

    @OneToMany(mappedBy="id")
    private Set<CategorieDeProduit> categories_produits;
    
}
