
package com.ubaya.projectdistprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DisplayMenuRestoran complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DisplayMenuRestoran"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kodeRestoran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayMenuRestoran", propOrder = {
    "kodeRestoran"
})
public class DisplayMenuRestoran {

    protected String kodeRestoran;

    /**
     * Gets the value of the kodeRestoran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeRestoran() {
        return kodeRestoran;
    }

    /**
     * Sets the value of the kodeRestoran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeRestoran(String value) {
        this.kodeRestoran = value;
    }

}
