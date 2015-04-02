package prueba.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Angel Luis on 02/04/2015.
 */
@Controller
public class Controlador {

    @RequestMapping("/index")
    public String saludo() {
        return "index";
    }
}
