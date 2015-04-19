package prueba.utils;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Angel Luis on 12/04/2015.
 */
@Service
public class Util{

    @Async
    public void accionLarga() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println("Esperando");
        }
        System.out.println("--------------------------------ACCION LARGA---------------------------------");
    }

   /* @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("Esperando");
        }
        System.out.println("--------------------------------ACCION LARGA---------------------------------");
    }*/
}
