package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_etablissement")
public class Etablissement {
    @Id @Column(name = "idEtablissement", length = 10) public String idEtablissement;
    @Column(name = "nomEtablissement", nullable = false, length = 255) public String nomEtablissement;
    protected Etablissement() {}
}

