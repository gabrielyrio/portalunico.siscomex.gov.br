//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.09.27 �s 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDesunitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDesunitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="numeroConteiner" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConteiner"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDesunitizacao", propOrder = {
    "numeroConteiner",
    "documentos"
})
public class TDesunitizacao {

    @XmlElement(required = true)
    protected String numeroConteiner;
    @XmlElement(required = true)
    protected Documentos documentos;

    /**
     * Obt�m o valor da propriedade numeroConteiner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    /**
     * Define o valor da propriedade numeroConteiner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConteiner(String value) {
        this.numeroConteiner = value;
    }

    /**
     * Obt�m o valor da propriedade documentos.
     * 
     * @return
     *     possible object is
     *     {@link Documentos }
     *     
     */
    public Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define o valor da propriedade documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
    }

}
