package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "auth_user_user_permissions")
public class UtilisateurPermission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "user_id", nullable = false) public Integer userId;
    @Column(name = "permission_id", nullable = false) public Integer permissionId;
    @ManyToOne @JoinColumn(name = "user_id", insertable = false, updatable = false) public Utilisateur utilisateur;
    @ManyToOne @JoinColumn(name = "permission_id", insertable = false, updatable = false) public PermissionUtilisateur permission;
    protected UtilisateurPermission() {}
}

