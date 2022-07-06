
package com.ubaya.projectdistprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TambahMenu complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TambahMenu"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TambahMenu", propOrder = {
    "kode",
    "nama",
    "harga"
})
public class TambahMenu {

    protected String kode;
    protected String nama;
    protected double harga;

    /**
     * Gets the value of the kode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKode() {
        return kode;
    }

    /**
     * Sets the value of the kode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKode(String value) {
        this.kode = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the harga property.
     * 
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     */
    public void setHarga(double value) {
        this.harga = value;
    }

}
