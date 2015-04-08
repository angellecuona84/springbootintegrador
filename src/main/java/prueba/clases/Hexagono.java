package prueba.clases;

/**
 * Created by Angel Luis on 02/04/2015.
 */
public class Hexagono extends Figura{

    private int radio;

    public Hexagono(int radio) {
        super();
        super.numeroLados = 6;
        this.radio = radio;
    }

    public Hexagono() {
        super.numeroLados = 6;
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
