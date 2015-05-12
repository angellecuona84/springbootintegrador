//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.05.12 a las 09:50:14 AM EDT 
//


package prueba.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaTrabajo" type="{http://webservice}WorkSpace"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areaTrabajo"
})
@XmlRootElement(name = "AreaTrabajoResponse")
public class AreaTrabajoResponse {

    @XmlElement(name = "AreaTrabajo", required = true)
    protected WorkSpace areaTrabajo;

    /**
     * Obtiene el valor de la propiedad areaTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link WorkSpace }
     *     
     */
    public WorkSpace getAreaTrabajo() {
        return areaTrabajo;
    }

    /**
     * Define el valor de la propiedad areaTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSpace }
     *     
     */
    public void setAreaTrabajo(WorkSpace value) {
        this.areaTrabajo = value;
    }

}
