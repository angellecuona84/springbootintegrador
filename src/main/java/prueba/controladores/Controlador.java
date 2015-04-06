package prueba.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import prueba.clases.Figura;
import prueba.dao.FiguraDAO;
import prueba.dao.FiguraDAOImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Angel Luis on 02/04/2015.
 */
@Controller
public class Controlador {

    /*@RequestMapping("/index")
     public String index(HttpServletResponse response) {

        return "index";
    }*/

    private FiguraDAO figuraDAO;

    public Controlador() throws  Exception{
            figuraDAO = new FiguraDAOImpl();

    }

    @RequestMapping("/index")
    public ModelAndView index() {
        HashMap map = new HashMap();
            map.put("figuras", figuraDAO.getFiguras());
            map.put("areaTotal",figuraDAO.areaTotal());
            map.put("perimetroTotal",figuraDAO.perimetroTotal());
        return new ModelAndView("index",map);
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
