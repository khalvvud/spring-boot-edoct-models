package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_ced")
public class Ced {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(columnDefinition = "LONGTEXT") public String description;
    @Column(name = "pathImage", length = 100) public String pathImage;
    @Column(length = 255) public String initiale;
    @Column(nullable = false, length = 255) public String titre;
    @Column(name = "directeur_id") public Long directeurId;
    @ManyToOne @JoinColumn(name = "directeur_id", insertable = false, updatable = false) public Professeur directeur;
    protected Ced() {}
}

