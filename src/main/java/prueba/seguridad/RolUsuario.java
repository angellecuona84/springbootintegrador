package prueba.seguridad;

import javax.persistence.*;

/**
 * Created by Angel Luis on 23/04/2015.
 */

@Entity
@Table(name = "user_roles",
        uniqueConstraints = @UniqueConstraint(
                columnNames = { "role", "username" }))
public class RolUsuario{

    private Integer userRoleId;
    private Usuario user;
    private String role;

    public RolUsuario() {
    }

    public RolUsuario(Usuario user, String role) {
        this.user = user;
        this.role = role;
    }


    @Id
    @GeneratedValue
    @Column(name = "user_role_id",
            unique = true, nullable = false)
    public Integer getUserRoleId() {
        return this.userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    public Usuario getUser() {
        return this.user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Column(name = "role", nullable = false, length = 45)
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}