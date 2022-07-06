
package com.ubaya.projectdistprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CheckRegister complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CheckRegister"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="nama_pemilik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nama_restoran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nomor_telepon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="jumlah_meja" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="jam_buka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="jam_tutup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRegister", propOrder = {
    "namaPemilik",
    "namaRestoran",
    "alamat",
    "nomorTelepon",
    "username",
    "password",
    "jumlahMeja",
    "jamBuka",
    "jamTutup"
})
public class CheckRegister {

    @XmlElement(name = "nama_pemilik")
    protected String namaPemilik;
    @XmlElement(name = "nama_restoran")
    protected String namaRestoran;
    protected String alamat;
    @XmlElement(name = "nomor_telepon")
    protected String nomorTelepon;
    protected String username;
    protected String password;
    @XmlElement(name = "jumlah_meja")
    protected int jumlahMeja;
    @XmlElement(name = "jam_buka")
    protected String jamBuka;
    @XmlElement(name = "jam_tutup")
    protected String jamTutup;

    /**
     * Gets the value of the namaPemilik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaPemilik() {
        return namaPemilik;
    }

    /**
     * Sets the value of the namaPemilik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaPemilik(String value) {
        this.namaPemilik = value;
    }

    /**
     * Gets the value of the namaRestoran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaRestoran() {
        return namaRestoran;
    }

    /**
     * Sets the value of the namaRestoran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaRestoran(String value) {
        this.namaRestoran = value;
    }

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
    }

    /**
     * Gets the value of the nomorTelepon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomorTelepon() {
        return nomorTelepon;
    }

    /**
     * Sets the value of the nomorTelepon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomorTelepon(String value) {
        this.nomorTelepon = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the jumlahMeja property.
     * 
     */
    public int getJumlahMeja() {
        return jumlahMeja;
    }

    /**
     * Sets the value of the jumlahMeja property.
     * 
     */
    public void setJumlahMeja(int value) {
        this.jumlahMeja = value;
    }

    /**
     * Gets the value of the jamBuka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJamBuka() {
        return jamBuka;
    }

    /**
     * Sets the value of the jamBuka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJamBuka(String value) {
        this.jamBuka = value;
    }

    /**
     * Gets the value of the jamTutup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJamTutup() {
        return jamTutup;
    }

    /**
     * Sets the value of the jamTutup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJamTutup(String value) {
        this.jamTutup = value;
    }

}
