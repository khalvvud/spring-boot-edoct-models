package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_formationdoctorale")
public class FormationDoctorale {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "pathImage", length = 100) public String pathImage;
    @Column(length = 255) public String initiale;
    @Column(nullable = false, length = 255) public String titre;
    @Column(name = "axeDeRecherche", columnDefinition = "LONGTEXT") public String axeDeRecherche;
    @Column(name = "dateAccreditation") public LocalDate dateAccreditation;
    @Column(name = "ced_id", nullable = false) public Long cedId;
    @Column(name = "etablissement_id", nullable = false, length = 10) public String etablissementId;
    @ManyToOne @JoinColumn(name = "ced_id", insertable = false, updatable = false) public Ced ced;
    @ManyToOne @JoinColumn(name = "etablissement_id", insertable = false, updatable = false) public Etablissement etablissement;
    protected FormationDoctorale() {}
}

