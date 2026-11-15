package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "candidat_notification")
public class NotificationCandidat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(nullable = false, length = 255) public String type;
    @Column(name = "candidat_id", nullable = false) public Long candidatId;
    @Column(name = "commission_id") public Long commissionId;
    @Column(name = "sujet_id") public Long sujetId;
    @ManyToOne @JoinColumn(name = "candidat_id", insertable = false, updatable = false) public Candidat candidat;
    @ManyToOne @JoinColumn(name = "commission_id", insertable = false, updatable = false) public Commission commission;
    @ManyToOne @JoinColumn(name = "sujet_id", insertable = false, updatable = false) public Sujet sujet;
    protected NotificationCandidat() {}
}

