
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
 *         &lt;element name="chain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "messageHandlerApplication",
    "chain",
    "branch",
    "messageData"
})
@XmlRootElement(name = "RequestData")
public class RequestData {

    protected String messageHandlerApplication;
    protected String chain;
    protected String branch;
    protected String messageData;

    /**
     * Recupera il valore della proprietà messageHandlerApplication.
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
     * Imposta il valore della proprietà messageHandlerApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageHandlerApplication(String value) {
        this.messageHandlerApplication = value;
    }

    /**
     * Recupera il valore della proprietà chain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChain() {
        return chain;
    }

    /**
     * Imposta il valore della proprietà chain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChain(String value) {
        this.chain = value;
    }

    /**
     * Recupera il valore della proprietà branch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Imposta il valore della proprietà branch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Recupera il valore della proprietà messageData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageData() {
        return messageData;
    }

    /**
     * Imposta il valore della proprietà messageData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageData(String value) {
        this.messageData = value;
    }

}
