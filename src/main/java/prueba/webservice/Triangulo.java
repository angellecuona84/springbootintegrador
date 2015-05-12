//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.05.12 a las 09:50:14 AM EDT 
//


package prueba.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Triangulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Triangulo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice}Figura">
 *       &lt;sequence>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotenusa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Triangulo", propOrder = {
    "altura",
    "base",
    "hipotenusa"
})
public class Triangulo
    extends Figura
{

    protected int altura;
    protected int base;
    protected int hipotenusa;

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     */
    public void setAltura(int value) {
        this.altura = value;
    }

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public int getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBase(int value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotenusa.
     * 
     */
    public int getHipotenusa() {
        return hipotenusa;
    }

    /**
     * Define el valor de la propiedad hipotenusa.
     * 
     */
    public void setHipotenusa(int value) {
        this.hipotenusa = value;
    }

}
