package prueba.clases;

/**
 * Created by Angel Luis on 02/04/2015.
 */
public class Triangulo extends Figura{

    private int base;
    private int altura;
    private int hipotenusa;

    public Triangulo(int numeroLados, int base, int altura, int hipotenusa) {
        super(numeroLados);
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }

    public Triangulo(int numeroLados) {
        super(numeroLados);
    }

    @Override
    public double getArea() {
        return base*altura;
    }

    @Override
    public double getPerimetro() {
        return base + altura + hipotenusa;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
}
