package ma.edoct.model;

import jakarta.persistence.*;

@Entity
@Table(name = "candidat_postuler", uniqueConstraints = @UniqueConstraint(columnNames = {"candidat_id", "sujet_id"}))
public class Candidature {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "pathFile", length = 100) private String pathFile;
    @ManyToOne(optional = false) @JoinColumn(name = "sujet_id", nullable = false) private Sujet sujet;
    @ManyToOne(optional = false) @JoinColumn(name = "candidat_id", nullable = false) private Candidat candidat;
    protected Candidature() {}
    public Candidature(Candidat candidat, Sujet sujet, String pathFile) {
        this.candidat = candidat; this.sujet = sujet; this.pathFile = pathFile;
    }
    public Long getId() { return id; }
    public Long getCandidatId() { return candidat == null ? null : candidat.id; }
    public Long getSujetId() { return sujet == null ? null : sujet.getId(); }
    public String getPathFile() { return pathFile; }
    public Sujet getSujet() { return sujet; }
    public void setPathFile(String value) { pathFile = value; }
    public void setSujet(Sujet value) { sujet = value; }
}
