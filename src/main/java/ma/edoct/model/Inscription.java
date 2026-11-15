package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_inscription")
public class Inscription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "dateDiposeDossier") public LocalDate dateDiposeDossier;
    @Column(length = 255) public String remarque;
    @Column(nullable = false) public boolean valider;
    @Column(name = "candidat_id", nullable = false) public Long candidatId;
    @Column(name = "sujet_id", nullable = false) public Long sujetId;
    @ManyToOne @JoinColumn(name = "candidat_id", insertable = false, updatable = false) public Candidat candidat;
    @ManyToOne @JoinColumn(name = "sujet_id", insertable = false, updatable = false) public Sujet sujet;
    protected Inscription() {}
}

