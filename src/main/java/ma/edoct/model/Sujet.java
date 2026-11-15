package ma.edoct.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "professeur_sujet")
public class Sujet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotBlank @Size(max = 255) private String titre;
    @Lob @Column(columnDefinition = "LONGTEXT") private String description;
    private boolean publier;
    @Column(name = "professeur_id", nullable = false) private Long professeurId;
    @Column(name = "coDirecteur_id") private Long coDirecteurId;
    @Column(name = "formationDoctorale_id", nullable = false) private Long formationDoctoraleId;
    @ManyToOne @JoinColumn(name = "professeur_id", insertable = false, updatable = false) private Professeur professeur;
    @ManyToOne @JoinColumn(name = "coDirecteur_id", insertable = false, updatable = false) private Professeur coDirecteur;
    @ManyToOne @JoinColumn(name = "formationDoctorale_id", insertable = false, updatable = false) private FormationDoctorale formationDoctorale;

    protected Sujet() {}
    public Sujet(String titre, String description, boolean publier, Long professeurId, Long coDirecteurId, Long formationDoctoraleId) {
        this.titre = titre; this.description = description; this.publier = publier;
        this.professeurId = professeurId; this.coDirecteurId = coDirecteurId; this.formationDoctoraleId = formationDoctoraleId;
    }
    public Long getId() { return id; }
    public String getTitre() { return titre; }
    public void setTitre(String value) { titre = value; }
    public String getDescription() { return description; }
    public void setDescription(String value) { description = value; }
    public boolean isPublier() { return publier; }
    public void setPublier(boolean value) { publier = value; }
    public Long getProfesseurId() { return professeurId; }
    public Long getCoDirecteurId() { return coDirecteurId; }
    public void setCoDirecteurId(Long value) { coDirecteurId = value; }
    public Long getFormationDoctoraleId() { return formationDoctoraleId; }
    public void setFormationDoctoraleId(Long value) { formationDoctoraleId = value; }
}
