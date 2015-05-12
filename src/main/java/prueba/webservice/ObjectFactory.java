//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.05.12 a las 09:50:14 AM EDT 
//


package prueba.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WorkSpace_QNAME = new QName("http://webservice", "WorkSpace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaTrabajoResponse }
     * 
     */
    public AreaTrabajoResponse createAreaTrabajoResponse() {
        return new AreaTrabajoResponse();
    }

    /**
     * Create an instance of {@link WorkSpace }
     * 
     */
    public WorkSpace createWorkSpace() {
        return new WorkSpace();
    }

    /**
     * Create an instance of {@link AreaTrabajoRequest }
     * 
     */
    public AreaTrabajoRequest createAreaTrabajoRequest() {
        return new AreaTrabajoRequest();
    }

    /**
     * Create an instance of {@link Triangulo }
     * 
     */
    public Triangulo createTriangulo() {
        return new Triangulo();
    }

    /**
     * Create an instance of {@link Hexagono }
     * 
     */
    public Hexagono createHexagono() {
        return new Hexagono();
    }

    /**
     * Create an instance of {@link Figura }
     * 
     */
    public Figura createFigura() {
        return new Figura();
    }

    /**
     * Create an instance of {@link Cuadrado }
     * 
     */
    public Cuadrado createCuadrado() {
        return new Cuadrado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkSpace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice", name = "WorkSpace")
    public JAXBElement<WorkSpace> createWorkSpace(WorkSpace value) {
        return new JAXBElement<WorkSpace>(_WorkSpace_QNAME, WorkSpace.class, null, value);
    }

}
