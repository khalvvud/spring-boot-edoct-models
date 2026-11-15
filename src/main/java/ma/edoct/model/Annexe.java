package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "candidat_annexe")
public class Annexe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "typeAnnexe", nullable = false, length = 100) public String typeAnnexe;
    @Column(nullable = false, length = 255) public String titre;
    @Column(name = "pathFile", nullable = false, length = 100) public String pathFile;
    @Column(name = "diplome_id", nullable = false) public Long diplomeId;
    @ManyToOne @JoinColumn(name = "diplome_id", insertable = false, updatable = false) public Diplome diplome;
    protected Annexe() {}
}

