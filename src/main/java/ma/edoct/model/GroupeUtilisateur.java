package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "auth_group")
public class GroupeUtilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Integer id;
    @Column(nullable = false, length = 150) public String name;
    protected GroupeUtilisateur() {}
}

