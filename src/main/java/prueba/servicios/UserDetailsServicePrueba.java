package prueba.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import prueba.dao.UsuarioDAO;
import prueba.seguridad.RolUsuario;
import prueba.seguridad.Usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Angel Luis on 23/04/2015.
 */
@Service("userDetailsService")
public class UserDetailsServicePrueba implements UserDetailsService {

    //get user from the database, via Hibernate
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDAO.findByUserName(username);
        List<GrantedAuthority> authorities =
                buildUserAuthority(usuario.getUserRole());

        return buildUserForAuthentication(usuario, authorities);
    }

    private User buildUserForAuthentication(Usuario usuario,
                                            List<GrantedAuthority> authorities) {
        return new User(usuario.getUsername(), usuario.getPassword(),
                usuario.isEnabled(), true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<RolUsuario> userRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        // Build user's authorities
        for (RolUsuario userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
        }

        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

        return Result;
    }
}
