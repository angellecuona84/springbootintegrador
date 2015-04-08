package prueba.clases;

/**
 * Created by Angel Luis on 02/04/2015.
 */
public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado) {
        super();
        super.numeroLados = 4;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return lado*4;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
