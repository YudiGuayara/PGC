package co.edu.udec.iwrmdms.user_ms.adapters.driven.jpa.postgresql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
<<<<<<< HEAD
@Table(name="roles")
=======
@Table(name = "roles")
>>>>>>> 1c3f0d3 (Resuelto conflicto)
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    private String name;
    private String description;
}
