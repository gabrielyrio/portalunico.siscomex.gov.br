//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.09.27 �s 10:25:53 AM BRT 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdditionalDocumentCategoryCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDocumentCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDocumentCategoryCodeType")
@XmlEnum
public enum AdditionalDocumentCategoryCodeType {


    /**
     * N�mero Drawback
     * 
     */
    AC;

    public String value() {
        return name();
    }

    public static AdditionalDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
