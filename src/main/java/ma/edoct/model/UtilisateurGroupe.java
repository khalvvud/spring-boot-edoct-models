package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "auth_user_groups")
public class UtilisateurGroupe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "user_id", nullable = false) public Integer userId;
    @Column(name = "group_id", nullable = false) public Integer groupId;
    @ManyToOne @JoinColumn(name = "user_id", insertable = false, updatable = false) public Utilisateur utilisateur;
    @ManyToOne @JoinColumn(name = "group_id", insertable = false, updatable = false) public GroupeUtilisateur groupe;
    protected UtilisateurGroupe() {}
}

