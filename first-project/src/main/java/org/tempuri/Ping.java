
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageHandlerApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageHandlerApplication"
})
@XmlRootElement(name = "Ping")
public class Ping {

    protected String messageHandlerApplication;

    /**
     * Recupera il valore della proprietÓ messageHandlerApplication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageHandlerApplication() {
        return messageHandlerApplication;
    }

    /**
     * Imposta il valore della proprietÓ messageHandlerApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageHandlerApplication(String value) {
        this.messageHandlerApplication = value;
    }

}
