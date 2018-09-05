
package com.dtdream.cma.dsp.softorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>softPriceBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="softPriceBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="finalpricewithVAT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="finalpricewithoutVAT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="savings" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="softwarePartNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "softPriceBean", propOrder = {
    "currencyCode",
    "discount",
    "finalpricewithVAT",
    "finalpricewithoutVAT",
    "returnCode",
    "savings",
    "softwarePartNo",
    "vat"
})
public class SoftPriceBean {

    protected String currencyCode;
    protected double discount;
    protected double finalpricewithVAT;
    protected double finalpricewithoutVAT;
    protected int returnCode;
    protected double savings;
    protected String softwarePartNo;
    protected double vat;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取discount属性的值。
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * 设置discount属性的值。
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * 获取finalpricewithVAT属性的值。
     * 
     */
    public double getFinalpricewithVAT() {
        return finalpricewithVAT;
    }

    /**
     * 设置finalpricewithVAT属性的值。
     * 
     */
    public void setFinalpricewithVAT(double value) {
        this.finalpricewithVAT = value;
    }

    /**
     * 获取finalpricewithoutVAT属性的值。
     * 
     */
    public double getFinalpricewithoutVAT() {
        return finalpricewithoutVAT;
    }

    /**
     * 设置finalpricewithoutVAT属性的值。
     * 
     */
    public void setFinalpricewithoutVAT(double value) {
        this.finalpricewithoutVAT = value;
    }

    /**
     * 获取returnCode属性的值。
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * 设置returnCode属性的值。
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * 获取savings属性的值。
     * 
     */
    public double getSavings() {
        return savings;
    }

    /**
     * 设置savings属性的值。
     * 
     */
    public void setSavings(double value) {
        this.savings = value;
    }

    /**
     * 获取softwarePartNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwarePartNo() {
        return softwarePartNo;
    }

    /**
     * 设置softwarePartNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwarePartNo(String value) {
        this.softwarePartNo = value;
    }

    /**
     * 获取vat属性的值。
     * 
     */
    public double getVat() {
        return vat;
    }

    /**
     * 设置vat属性的值。
     * 
     */
    public void setVat(double value) {
        this.vat = value;
    }

}
