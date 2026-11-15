package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "professeur_commission_professeurs")
public class MembreCommission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "commission_id", nullable = false) public Long commissionId;
    @Column(name = "professeur_id", nullable = false) public Long professeurId;
    @ManyToOne @JoinColumn(name = "commission_id", insertable = false, updatable = false) public Commission commission;
    @ManyToOne @JoinColumn(name = "professeur_id", insertable = false, updatable = false) public Professeur professeur;
    protected MembreCommission() {}
}

