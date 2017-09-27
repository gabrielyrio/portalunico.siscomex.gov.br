package br.gov.siscomex.portalunico.due;

import com.google.gson.annotations.SerializedName;

public enum SituacaoCarga {
    @SerializedName("1")
    Estocada(1),

    @SerializedName("2")
    Em_Tr�nsito(2),
    
    @SerializedName("3")
    Carga_Completamente_Exportada(3),
    
    @SerializedName("4")
    N�o_se_aplica(4);
    
    private final int value;
    
    public int getValue() {
        return value;
    }
    
    public String getDescricao() {
        return this.name();
    }

    private SituacaoCarga(int value) {
        this.value = value;
    }
}
