package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_examiner")
public class Evaluation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(length = 255) public String decision;
    @Column(name = "noteDossier", nullable = false) public Float noteDossier;
    @Column(name = "noteEntretien", nullable = false) public Integer noteEntretien;
    @Column(nullable = false) public boolean publier;
    @Column(name = "commission_id", nullable = false) public Long commissionId;
    @Column(name = "sujet_id", nullable = false) public Long sujetId;
    @Column(name = "candidat_id", nullable = false) public Long candidatId;
    @Column(nullable = false) public boolean valider;
    @ManyToOne @JoinColumn(name = "commission_id", insertable = false, updatable = false) public Commission commission;
    @ManyToOne @JoinColumn(name = "sujet_id", insertable = false, updatable = false) public Sujet sujet;
    @ManyToOne @JoinColumn(name = "candidat_id", insertable = false, updatable = false) public Candidat candidat;
    protected Evaluation() {}
}

