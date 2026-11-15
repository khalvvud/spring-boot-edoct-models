package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_laboratoire")
public class Laboratoire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "nomLaboratoire", nullable = false, length = 255) public String nomLaboratoire;
    @Column(columnDefinition = "LONGTEXT") public String description;
    @Column(name = "pathImage", length = 100) public String pathImage;
    @Column(length = 255) public String initial;
    @Column(name = "ced_id", nullable = false) public Long cedId;
    @Column(name = "directeur_id", nullable = false) public Long directeurId;
    @Column(name = "etablissement_id", nullable = false, length = 10) public String etablissementId;
    @ManyToOne @JoinColumn(name = "ced_id", insertable = false, updatable = false) public Ced ced;
    @ManyToOne @JoinColumn(name = "directeur_id", insertable = false, updatable = false) public Professeur directeur;
    @ManyToOne @JoinColumn(name = "etablissement_id", insertable = false, updatable = false) public Etablissement etablissement;
    protected Laboratoire() {}
}

