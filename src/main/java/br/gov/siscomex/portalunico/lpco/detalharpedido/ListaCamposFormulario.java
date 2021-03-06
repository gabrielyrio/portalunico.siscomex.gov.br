
package br.gov.siscomex.portalunico.lpco.detalharpedido;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaCamposFormulario {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("listaValor")
    @Expose
    private List<String> listaValor = new ArrayList<String>();
    @SerializedName("intervenientes")
    @Expose
    private List<Interveniente> intervenientes = new ArrayList<Interveniente>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getListaValor() {
        return listaValor;
    }

    public void setListaValor(List<String> listaValor) {
        this.listaValor = listaValor;
    }

    public List<Interveniente> getIntervenientes() {
        return intervenientes;
    }

    public void setIntervenientes(List<Interveniente> intervenientes) {
        this.intervenientes = intervenientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListaCamposFormulario.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codigo");
        sb.append('=');
        sb.append(((this.codigo == null)?"<null>":this.codigo));
        sb.append(',');
        sb.append("listaValor");
        sb.append('=');
        sb.append(((this.listaValor == null)?"<null>":this.listaValor));
        sb.append(',');
        sb.append("intervenientes");
        sb.append('=');
        sb.append(((this.intervenientes == null)?"<null>":this.intervenientes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.intervenientes == null)? 0 :this.intervenientes.hashCode()));
        result = ((result* 31)+((this.listaValor == null)? 0 :this.listaValor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaCamposFormulario) == false) {
            return false;
        }
        ListaCamposFormulario rhs = ((ListaCamposFormulario) other);
        return ((((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo)))&&((this.intervenientes == rhs.intervenientes)||((this.intervenientes!= null)&&this.intervenientes.equals(rhs.intervenientes))))&&((this.listaValor == rhs.listaValor)||((this.listaValor!= null)&&this.listaValor.equals(rhs.listaValor))));
    }

}
