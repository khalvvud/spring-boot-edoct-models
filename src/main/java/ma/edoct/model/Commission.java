package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_commission")
public class Commission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "dateCommission", nullable = false) public LocalDate dateCommission;
    @Column(nullable = false, length = 255) public String lieu;
    @Column(name = "heure", nullable = false) public LocalTime heure;
    @Column(name = "labo_id", nullable = false) public Long laboratoireId;
    @ManyToOne @JoinColumn(name = "labo_id", insertable = false, updatable = false) public Laboratoire laboratoire;
    protected Commission() {}
}

