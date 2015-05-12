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
 * <p>Clase Java para Hexagono complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Hexagono">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice}Figura">
 *       &lt;sequence>
 *         &lt;element name="radio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hexagono", propOrder = {
    "radio"
})
public class Hexagono
    extends Figura
{

    protected int radio;

    /**
     * Obtiene el valor de la propiedad radio.
     * 
     */
    public int getRadio() {
        return radio;
    }

    /**
     * Define el valor de la propiedad radio.
     * 
     */
    public void setRadio(int value) {
        this.radio = value;
    }

}
