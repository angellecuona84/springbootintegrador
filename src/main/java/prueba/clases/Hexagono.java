package prueba.clases;

/**
 * Created by Angel Luis on 02/04/2015.
 */
public class Hexagono extends Figura{

    private int radio;

    public Hexagono(int numeroLados, int radio) {
        super(numeroLados);
        this.radio = radio;
    }

    public Hexagono(int numeroLados) {
        super(numeroLados);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return numeroLados*radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getApotema(){
        return 5;
    }
}
