package ma.edoct.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity @Table(name = "auth_user")
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Integer id;
    @Column(nullable = false, length = 128) public String password;
    public java.time.LocalDateTime last_login;
    @Column(nullable = false) public boolean is_superuser;
    @Column(nullable = false, unique = true, length = 150) public String username;
    @Column(nullable = false, length = 150) public String first_name;
    @Column(nullable = false, length = 150) public String last_name;
    @Column(nullable = false, length = 254) public String email;
    @Column(nullable = false) public boolean is_staff;
    @Column(nullable = false) public boolean is_active;
    @Column(nullable = false) public java.time.LocalDateTime date_joined;
    protected Utilisateur() {}
}

