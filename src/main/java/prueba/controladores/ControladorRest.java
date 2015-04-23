package prueba.controladores;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import prueba.clases.WorkSpace;
import prueba.dao.FiguraDAO;
import prueba.dao.FiguraDAOImpl;

/**
 * Created by Angel Luis on 08/04/2015.
 */
@RestController
public class ControladorRest {

    @Autowired
    @Qualifier("FiguraDAODBImpl")
    private FiguraDAO figuraDAO;

    public ControladorRest() throws Exception {
        figuraDAO = new FiguraDAOImpl();

    }

    @RequestMapping(value = "/consultarAreaTrabajo", produces = "application/json")
    @ResponseBody
    public WorkSpace obtenerAreaTrabajo() {
        WorkSpace a =  figuraDAO.obtenerAreaTrabajo("1");
        return a;
    }
}
