//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.09.27 �s 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnidadeMedida.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnidadeMedida">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="m3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnidadeMedida")
@XmlEnum
public enum UnidadeMedida {

    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("m3")
    M_3("m3");
    private final String value;

    UnidadeMedida(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnidadeMedida fromValue(String v) {
        for (UnidadeMedida c: UnidadeMedida.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
