package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    private Long id;

    private String rue;
    private String numero;
    private String code_postal;
    private String ville;

    @OneToOne
    private Client client;
}
