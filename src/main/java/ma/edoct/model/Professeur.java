package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_professeur")
public class Professeur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(length = 30) public String cin;
    @Column(name = "telProfesseur", length = 30) public String telProfesseur;
    @Column(name = "pathPhoto", length = 200) public String pathPhoto;
    @Column(length = 10) public String grade;
    @Column(name = "numSOM", length = 50) public String numSOM;
    @Column(name = "nombreEncadrer", nullable = false) public Integer nombreEncadrer;
    @Column(name = "nombreProposer", nullable = false) public Integer nombreProposer;
    @Column(name = "etablissement_id", nullable = false, length = 10) public String etablissementId;
    @Column(name = "labo_id") public Long laboratoireId;
    @Column(name = "user_id", nullable = false) public Integer userId;
    @ManyToOne @JoinColumn(name = "etablissement_id", insertable = false, updatable = false) public Etablissement etablissement;
    @ManyToOne @JoinColumn(name = "labo_id", insertable = false, updatable = false) public Laboratoire laboratoire;
    @ManyToOne @JoinColumn(name = "user_id", insertable = false, updatable = false) public Utilisateur utilisateur;
    protected Professeur() {}
}

