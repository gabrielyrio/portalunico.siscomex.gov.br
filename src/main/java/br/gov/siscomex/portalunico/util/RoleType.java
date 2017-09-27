package br.gov.siscomex.portalunico.util;

/**
 * Perfil para o qual se deseja efetuar a autentica��o.
 * <br><a href="https://val.portalunico.siscomex.gov.br/docs/api/#autentica-o">https://val.portalunico.siscomex.gov.br/docs/api/#autentica-o</a>
 */
public enum RoleType {
    /**
     * Declarante importador/exportador
     */
    IMPEXP,
    /**
     * Deposit�rio
     */
    DEPOSIT,
    /**
     * Operador Portu�rio
     */
    OPERPORT,
    /**
     * Transportador
     */
    TRANSPORT,
    /**
     * Remessa Expressa/Correio
     */
    AGEREMESS,
    /**
     * Ajudante de Despachante
     */
    AJUDESPAC,
    /**
     * Habilitador
     */
    HABILITAD,
    /**
     * P�blico
     */
    PUBLICO;
}
