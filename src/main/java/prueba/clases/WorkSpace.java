package prueba.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel Luis on 02/04/2015.
 */
public class WorkSpace {

    private String nombre;
    private int limiteFigura;
    private List<Figura> figuras;

    public WorkSpace(String nombre, int limiteFigura) {
        this.nombre = nombre;
        this.limiteFigura = limiteFigura;
        figuras = new ArrayList<Figura>(limiteFigura);
    }

    public boolean agregarFigura(Figura figura) throws Exception {
        if (figuras.size() < limiteFigura){
            figuras.add(figura);
        return true;
        }
        else throw new Exception("Ha excedido el limite permitido de figuras");
    }

    public boolean eliminarFigura(Figura figura) {
        figuras.remove(figura);
        return true;
        }

    public boolean isLleno(){
        return figuras.size() == limiteFigura ;
    }

    public double getAreaTotal(){
        double areaTotal = 0;
        for (int i = 0; i < limiteFigura; i++) {
            areaTotal += figuras.get(i).getArea();
        }
        return  areaTotal;
    }

    public double getApotema(){
        double apotemaTotal = 0;
        for (int i = 0; i < limiteFigura; i++) {
            Figura figura = figuras.get(i);
            if (figura instanceof Hexagono)
            apotemaTotal += ((Hexagono) figuras.get(i)).getApotema();
        }
        return  apotemaTotal;
    }

    public void cambiarFigura(Figura figVieja, Figura figNueva){
        for (int i = 0; i < limiteFigura; i++) {
            if (figuras.get(i).equals(figVieja)){
                figuras.set(i,figNueva);
            return ;
            }
        }
    }
}

