
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDocumentCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDocumentCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DSG"/>
 *     &lt;enumeration value="DSI"/>
 *     &lt;enumeration value="DSIG"/>
 *     &lt;enumeration value="LPCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDocumentCategoryCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum AdditionalDocumentCategoryCodeType {


    /**
     * Drawback Suspens�o Comum
     * 
     */
    AC,

    /**
     * Drawback Suspens�o Gen�rico
     * 
     */
    DSG,

    /**
     * Drawback Suspens�o Intermedi�rio
     * 
     */
    DSI,

    /**
     * Drawback Suspens�o Intermedi�rio gen�rico
     * 
     */
    DSIG,

    /**
     * LPCO
     * 
     */
    LPCO;

    public String value() {
        return name();
    }

    public static AdditionalDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
