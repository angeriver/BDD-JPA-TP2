package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Commande {
    @Id
    private Long id;

    private Date date;
    private Double montant_total;

    @ManyToOne
    private Client client;

}
