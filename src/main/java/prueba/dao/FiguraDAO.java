package prueba.dao;

import prueba.clases.Figura;

import java.util.List;

/**
 * Created by Angel Luis on 05/04/2015.
 */
public interface FiguraDAO {

    public List<Figura> getFiguras();
    public double areaTotal();
    public double perimetroTotal();
    void eliminarFiguraPos(int valor);
    void adicionarCuadrado(int valor) throws Exception;
}
