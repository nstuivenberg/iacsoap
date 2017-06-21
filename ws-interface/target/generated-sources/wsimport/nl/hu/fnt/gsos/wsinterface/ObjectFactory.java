
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.hu.fnt.gsos.wsinterface package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.hu.fnt.gsos.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateHouseRequest }
     * 
     */
    public UpdateHouseRequest createUpdateHouseRequest() {
        return new UpdateHouseRequest();
    }

    /**
     * Create an instance of {@link CreateHouseResponse }
     * 
     */
    public CreateHouseResponse createCreateHouseResponse() {
        return new CreateHouseResponse();
    }

    /**
     * Create an instance of {@link ReadHouseResponse }
     * 
     */
    public ReadHouseResponse createReadHouseResponse() {
        return new ReadHouseResponse();
    }

    /**
     * Create an instance of {@link UpdateHouseResponse }
     * 
     */
    public UpdateHouseResponse createUpdateHouseResponse() {
        return new UpdateHouseResponse();
    }

    /**
     * Create an instance of {@link CreateHouseRequest }
     * 
     */
    public CreateHouseRequest createCreateHouseRequest() {
        return new CreateHouseRequest();
    }

    /**
     * Create an instance of {@link DeleteHouseRequest }
     * 
     */
    public DeleteHouseRequest createDeleteHouseRequest() {
        return new DeleteHouseRequest();
    }

    /**
     * Create an instance of {@link DeleteHouseResponse }
     * 
     */
    public DeleteHouseResponse createDeleteHouseResponse() {
        return new DeleteHouseResponse();
    }

    /**
     * Create an instance of {@link ReadHouseRequest }
     * 
     */
    public ReadHouseRequest createReadHouseRequest() {
        return new ReadHouseRequest();
    }

}
