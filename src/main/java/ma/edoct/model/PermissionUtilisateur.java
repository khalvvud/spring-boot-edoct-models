package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "auth_permission")
public class PermissionUtilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Integer id;
    @Column(nullable = false, length = 255) public String name;
    @Column(name = "content_type_id", nullable = false) public Integer contentTypeId;
    @Column(nullable = false, length = 100) public String codename;
    protected PermissionUtilisateur() {}
}

