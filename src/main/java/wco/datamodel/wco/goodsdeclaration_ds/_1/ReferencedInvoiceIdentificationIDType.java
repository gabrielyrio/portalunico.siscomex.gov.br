
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 	
 * 		Quando uma Nota Fiscal for fomul�rio, enviar neste campo como identificador o seguinte formato:
 * 	
 * 	Prefixo F para determinar que � nota Formul�rio
 * 		1 caracter
 * 	cUF - C�digo da UF do emitente do Documento Fiscal 
 * 		2 caracteres
 * 	AAMM - Ano e M�s de emiss�o da NF-e 
 * 		4 caracteres
 * 	CNPJ - CNPJ do emitente 
 * 		14 caracteres
 * 	mod - Modelo do Documento Fiscal 
 * 		2 caracteres
 * 	serie - S�rie do Documento Fiscal 
 * 		3 caracteres
 * 	nNF - N�mero do Documento Fiscal 
 * 	9 caracteres
 * 	tpEmis � forma de emiss�o da NF-e
 * 		1 caracteres
 * 	cNF - C�digo Num�rico que comp�e a Chave de Acesso 
 * 		8 caracteres
 * 
 * 		
 * 		O identificador da Nota Fiscal Formul�rio seguir� regras semelhantes ao da NFe. Apenas o primeiro caracter que deve ser um F e n�o � necess�rio o digito verificador ao final.
 * 		Para maiores detalhes do preenchimento, seguir o manual da NF-e. http://www.nfe.fazenda.gov.br/portal/listaConteudo.aspx?tipoConteudo=33ol5hhSYZk=
 * 	
 * 
 * <p>Java class for ReferencedInvoiceIdentificationIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedInvoiceIdentificationIDType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedInvoiceIdentificationIDType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1", propOrder = {
    "value"
})
public class ReferencedInvoiceIdentificationIDType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the schemeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Sets the value of the schemeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

}
