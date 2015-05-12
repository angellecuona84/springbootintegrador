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
        System.out.println("--------------------------------ACCION LARGA Iniciada---------------------------------");
        for (int i = 0; i < 1000 ; i++) {
            System.out.println("Esperando");
            //accionLarga1(i);
        }
        System.out.println("--------------------------------ACCION LARGA Terminada---------------------------------");
    }

    @Async
    public void accionLarga1(int j) {
        System.out.println("--------------------------------SUBACCION " + j +" Iniciada---------------------------------");
        for (int i = 0; i < 100 ; i++) {
            System.out.println("Esperando" + j);
        }
        System.out.println("--------------------------------SUBACCION " + j +" Terminada---------------------------------");
    }

   /* @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("Esperando");
        }
        System.out.println("--------------------------------ACCION LARGA---------------------------------");
    }*/
}
