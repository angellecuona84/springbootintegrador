package prueba.clases;

/**
 * Created by Angel Luis on 02/04/2015.
 */
public abstract class Figura {

    protected int numeroLados;

    public Figura() {
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
}
