package prueba.dao;

import prueba.seguridad.Usuario;

/**
 * Created by Angel Luis on 23/04/2015.
 */
public interface UsuarioDAO {
    public Usuario findByUserName(String username);
}
