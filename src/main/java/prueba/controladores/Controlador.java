package prueba.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    public Controlador() throws Exception {
        figuraDAO = new FiguraDAOImpl();

    }

    @RequestMapping("/index")
    public ModelAndView index() {

        HashMap map = this.cargarFiguras();
        return new ModelAndView("index", map);
    }

    private HashMap cargarFiguras() {
        HashMap map = new HashMap();
        map.put("figuras", figuraDAO.getFiguras());
        map.put("areaTotal", figuraDAO.areaTotal());
        map.put("perimetroTotal", figuraDAO.perimetroTotal());
        return map;
    }


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/Eliminar")
    public ModelAndView eliminar(HttpServletRequest request) {
        int valor = Integer.parseInt(request.getParameter("id"));
        figuraDAO.eliminarFiguraPos(valor);
        return new ModelAndView("index", this.cargarFiguras());
    }

    @RequestMapping(value = "/adicionarCuadrado", method = {RequestMethod.POST})
    public ModelAndView addCuadrado(HttpServletRequest request) {
        int valor = Integer.parseInt(request.getParameter("lado"));
        try {
            figuraDAO.adicionarCuadrado(valor);
        } catch (Exception e) {
            HashMap map = this.cargarFiguras();
            map.put("error",e.getMessage());
            return new ModelAndView("index", map);
        }
        return new ModelAndView("index", this.cargarFiguras());
    }
}
