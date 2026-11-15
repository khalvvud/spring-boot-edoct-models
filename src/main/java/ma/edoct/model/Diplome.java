package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "candidat_diplome")
public class Diplome {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(nullable = false, length = 255) public String intitule;
    @Column(length = 500) public String type;
    @Column(name = "dateCommission", nullable = false) public LocalDate dateCommission;
    @Column(nullable = false, length = 50) public String mention;
    @Column(nullable = false, length = 255) public String pays;
    @Column(nullable = false, length = 255) public String etablissement;
    @Column(length = 255) public String specialite;
    @Column(nullable = false, length = 255) public String ville;
    @Column(nullable = false, length = 255) public String province;
    @Column(name = "moyen_general", nullable = false) public Double moyen_general;
    @Column(name = "candidat_id", nullable = false) public Long candidatId;
    @ManyToOne @JoinColumn(name = "candidat_id", insertable = false, updatable = false) public Candidat candidat;
    protected Diplome() {}
}

