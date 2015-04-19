package prueba.clases;

import javax.persistence.*;

/**
 * Created by Angel Luis on 02/04/2015.
 */
@Entity
@Table(name="FIGURA")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Figura {


    @Id
    @GeneratedValue
    @Column(name="FIGURA_ID")
    protected int id;

    @Column(name = "NUMERO_LADOS", nullable = false)
    protected int numeroLados;

    @ManyToOne
    @JoinColumn(name="WORKSPACE_ID")
    protected WorkSpace workSpace;

    public Figura() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
