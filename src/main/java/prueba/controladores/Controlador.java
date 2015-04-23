package prueba.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import prueba.clases.Figura;
import prueba.clases.WorkSpace;
import prueba.dao.FiguraDAO;
import prueba.dao.FiguraDAOImpl;
import prueba.mail.EnviarEmail;
import prueba.utils.Util;

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
    @Autowired
    private Util util;

    @Autowired
    @Qualifier("FiguraDAODBImpl")
    private FiguraDAO figuraDAO;

    @Autowired
    private EnviarEmail enviarEmail;

    public Controlador() throws Exception {
        //figuraDAO = new FiguraDAOImpl();

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
            //Recordar aqui que el manejo de error solo esta en el DAO en memoria.
            figuraDAO.adicionarCuadrado(valor);
        } catch (Exception e) {
            HashMap map = this.cargarFiguras();
            map.put("error",e.getMessage());
            return new ModelAndView("index", map);
        }
        return new ModelAndView("index", this.cargarFiguras());
    }

    @RequestMapping("/enviarCorreo")
    public ModelAndView enviarCorreo() {
        enviarEmail.sendMail("angelcubano@gmail.com", "angelcubano@gmail.com","Prueba","Por Dios que pinche jejeje");
        return new ModelAndView("index", this.cargarFiguras());
    }

    @RequestMapping("/enviarCorreoAdjunto")
    public ModelAndView enviarCorreoAdjunto() {
        try {
            enviarEmail.sendMailAdjunto("angelcubano@gmail.com", "angelcubano@gmail.com", "Prueba", "Por Dios que pinche jejeje", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("index", this.cargarFiguras());
    }

    @RequestMapping("/tareaAsincrona")
    public ModelAndView tareaAsincrona() {
        System.out.println("--------------------------------Aqui Empieza tarea Asincrona---------------------------------");
        //taskExecutor.execute(new Util());
        util.accionLarga();
        System.out.println("--------------------------------Aqui Termina tarea Asincrona---------------------------------");
        return new ModelAndView("index", this.cargarFiguras());
    }


}
