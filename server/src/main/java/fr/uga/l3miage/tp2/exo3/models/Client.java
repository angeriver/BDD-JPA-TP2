package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {
    @Id
    private Long id;

    private String nom;
    private String email;

    @OneToOne
    @JoinColumn(name="adresse")
    private Adresse adresse;

    @OneToMany(mappedBy = "id")
    private Set<Commande> commandes;

}
