package prueba.seguridad;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Angel Luis on 23/04/2015.
 */
@Entity
@Table(name="usuario")
public class Usuario {

    private String username;
    private String password;
    private boolean enabled;
    private Set<RolUsuario> userRole = new HashSet<RolUsuario>();

    public Usuario() {
    }

    public Usuario(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public Usuario(String username, String password,
                boolean enabled, Set<RolUsuario> userRole) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.userRole = userRole;
    }


    @Id
    @Column(name = "username", unique = true,
            nullable = false, length = 45)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password",
            nullable = false, length = 60)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "enabled", nullable = false)
    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<RolUsuario> getUserRole() {
        return this.userRole;
    }

    public void setUserRole(Set<RolUsuario> userRole) {
        this.userRole = userRole;
    }

}
