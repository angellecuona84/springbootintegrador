package prueba.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import prueba.clases.WorkSpace;
import prueba.seguridad.Usuario;

/**
 * Created by Angel Luis on 23/04/2015.
 */
@Repository
@Transactional
public class UsuarioDAOImpl extends AbstractDAO implements UsuarioDAO{
    @Override
    public Usuario findByUserName(String username) {
        Criteria criteria = getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("username", username));
        Object usuario = criteria.uniqueResult();
        return usuario!= null? (Usuario) criteria.uniqueResult() :null;
    }
}
