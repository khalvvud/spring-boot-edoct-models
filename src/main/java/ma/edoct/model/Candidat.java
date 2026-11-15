package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "candidat_candidat")
public class Candidat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(nullable = false, length = 30) public String cne;
    @Column(nullable = false, length = 30) public String cin;
    @Column(name = "nomCandidatAr", length = 255) public String nomCandidatAr;
    @Column(name = "prenomCandidatAr", length = 255) public String prenomCandidatAr;
    @Column(nullable = false, columnDefinition = "LONGTEXT") public String adresse;
    @Column(name = "adresseAr", columnDefinition = "LONGTEXT") public String adresseAr;
    @Column(length = 20) public String sexe;
    @Column(name = "villeDeNaissance", nullable = false, length = 255) public String villeDeNaissance;
    @Column(name = "villeDeNaissanceAr", length = 255) public String villeDeNaissanceAr;
    @Column(nullable = false, length = 255) public String ville;
    @Column(name = "dateDeNaissance", nullable = false) public LocalDate dateDeNaissance;
    @Column(name = "typeDeHandiCape", length = 30) public String typeDeHandiCape;
    @Column(length = 255) public String academie;
    @Column(name = "telCandidat", length = 30) public String telCandidat;
    @Column(name = "pathCv", length = 100) public String pathCv;
    @Column(name = "pathPhoto", length = 100) public String pathPhoto;
    @Column(name = "etatDossier") public Integer etatDossier;
    @Column(name = "situation_familiale", length = 50) public String situationFamiliale;
    @Column(name = "pays_id", nullable = false) public Long paysId;
    @Column(name = "user_id", nullable = false) public Integer userId;
    @Column(nullable = false) public boolean fonctionaire;
    @ManyToOne @JoinColumn(name = "pays_id", insertable = false, updatable = false) public Pays pays;
    @ManyToOne @JoinColumn(name = "user_id", insertable = false, updatable = false) public Utilisateur utilisateur;
    protected Candidat() {}
}

