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
        for (int i = 0; i < figuras.size(); i++) {
            areaTotal += figuras.get(i).getArea();
        }
        return  areaTotal;
    }

    public double getApotema(){
        double apotemaTotal = 0;
        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            if (figura instanceof Hexagono)
            apotemaTotal += ((Hexagono) figuras.get(i)).getApotema();
        }
        return  apotemaTotal;
    }

    public void cambiarFigura(Figura figVieja, Figura figNueva){
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).equals(figVieja)){
                figuras.set(i,figNueva);
            return ;
            }
        }
    }

    public double perimetroTotal(){
        double result = 0;
        for (int i = 0; i < figuras.size() ; i++) {
            result += figuras.get(i).getPerimetro();
        }
        return result;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public int getLimiteFigura() {
        return limiteFigura;
    }

    public void setLimiteFigura(int limiteFigura) {
        this.limiteFigura = limiteFigura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

