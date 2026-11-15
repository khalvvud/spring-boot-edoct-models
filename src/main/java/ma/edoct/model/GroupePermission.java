package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "auth_group_permissions")
public class GroupePermission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column(name = "group_id", nullable = false) public Integer groupId;
    @Column(name = "permission_id", nullable = false) public Integer permissionId;
    @ManyToOne @JoinColumn(name = "group_id", insertable = false, updatable = false) public GroupeUtilisateur groupe;
    @ManyToOne @JoinColumn(name = "permission_id", insertable = false, updatable = false) public PermissionUtilisateur permission;
    protected GroupePermission() {}
}

