
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="straatnaam">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="huisnummer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="huisnummertoevoeging">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postcode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9][0-9][0-9][0-9][a-zA-Z][a-zA-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "straatnaam",
    "huisnummer",
    "huisnummertoevoeging",
    "postcode"
})
@XmlRootElement(name = "deleteHouseRequest", namespace = "http://iac.nl.schemas/deleteHouseRequest")
public class DeleteHouseRequest {

    @XmlElement(namespace = "http://iac.nl.schemas/deleteHouseRequest", required = true)
    protected String straatnaam;
    @XmlElement(namespace = "http://iac.nl.schemas/deleteHouseRequest")
    protected int huisnummer;
    @XmlElement(namespace = "http://iac.nl.schemas/deleteHouseRequest", required = true)
    protected String huisnummertoevoeging;
    @XmlElement(namespace = "http://iac.nl.schemas/deleteHouseRequest", required = true)
    protected String postcode;

    /**
     * Gets the value of the straatnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaam() {
        return straatnaam;
    }

    /**
     * Sets the value of the straatnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaam(String value) {
        this.straatnaam = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     */
    public int getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     */
    public void setHuisnummer(int value) {
        this.huisnummer = value;
    }

    /**
     * Gets the value of the huisnummertoevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnummertoevoeging() {
        return huisnummertoevoeging;
    }

    /**
     * Sets the value of the huisnummertoevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnummertoevoeging(String value) {
        this.huisnummertoevoeging = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

}
