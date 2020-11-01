package pgxp.util.entity;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * <p>
 * Cnpj class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
public class Cnpj implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String matriz;
    private String razaosocial;
    private String fantasia;
    private String situacao;
    private String datasituacao;
    private String motivosituacao;
    private String cidadeexterior;
    private String codpais;
    private String nomepais;
    private String natjuridica;
    private String inicioatividade;
    private String cnae;
    private String tipologradouro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String uf;
    private String codmunicipio;
    private String municipio;
    private String fone1;
    private String fone2;
    private String email;
    private String qualiresp;
    private String capital;
    private String porteempresa;
    private String simples;
    private String dataentradasimples;
    private String datasaidasimples;
    private String mei;
    private String situacaoespecial;
    private String datasitespecial;

    /**
     * <p>
     * Getter for the field <code>cnpj</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * <p>
     * Setter for the field <code>cnpj</code>.</p>
     *
     * @param cnpj a {@link java.lang.String} object.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * <p>
     * Getter for the field <code>matriz</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMatriz() {
        return matriz;
    }

    /**
     * <p>
     * Setter for the field <code>matriz</code>.</p>
     *
     * @param matriz a {@link java.lang.String} object.
     */
    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    /**
     * <p>
     * Getter for the field <code>razaosocial</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRazaosocial() {
        return razaosocial;
    }

    /**
     * <p>
     * Setter for the field <code>razaosocial</code>.</p>
     *
     * @param razaosocial a {@link java.lang.String} object.
     */
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    /**
     * <p>
     * Getter for the field <code>fantasia</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFantasia() {
        return fantasia;
    }

    /**
     * <p>
     * Setter for the field <code>fantasia</code>.</p>
     *
     * @param fantasia a {@link java.lang.String} object.
     */
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    /**
     * <p>
     * Getter for the field <code>situacao</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * <p>
     * Setter for the field <code>situacao</code>.</p>
     *
     * @param situacao a {@link java.lang.Integer} object.
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * <p>
     * Getter for the field <code>datasituacao</code>.</p>
     *
     * @return a {@link java.util.Date} object.
     */
    public String getDatasituacao() {
        return datasituacao;
    }

    /**
     * <p>
     * Setter for the field <code>datasituacao</code>.</p>
     *
     * @param datasituacao a {@link java.util.Date} object.
     */
    public void setDatasituacao(String datasituacao) {
        this.datasituacao = datasituacao;
    }

    /**
     * <p>
     * Getter for the field <code>motivosituacao</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMotivosituacao() {
        return motivosituacao;
    }

    /**
     * <p>
     * Setter for the field <code>motivosituacao</code>.</p>
     *
     * @param motivosituacao a {@link java.lang.String} object.
     */
    public void setMotivosituacao(String motivosituacao) {
        this.motivosituacao = motivosituacao;
    }

    /**
     * <p>
     * Getter for the field <code>cidadeexterior</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCidadeexterior() {
        return cidadeexterior;
    }

    /**
     * <p>
     * Setter for the field <code>cidadeexterior</code>.</p>
     *
     * @param cidadeexterior a {@link java.lang.String} object.
     */
    public void setCidadeexterior(String cidadeexterior) {
        this.cidadeexterior = cidadeexterior;
    }

    /**
     * <p>
     * Getter for the field <code>codpais</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCodpais() {
        return codpais;
    }

    /**
     * <p>
     * Setter for the field <code>codpais</code>.</p>
     *
     * @param codpais a {@link java.lang.String} object.
     */
    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    /**
     * <p>
     * Getter for the field <code>nomepais</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNomepais() {
        return nomepais;
    }

    /**
     * <p>
     * Setter for the field <code>nomepais</code>.</p>
     *
     * @param nomepais a {@link java.lang.String} object.
     */
    public void setNomepais(String nomepais) {
        this.nomepais = nomepais;
    }

    /**
     * <p>
     * Getter for the field <code>natjuridica</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNatjuridica() {
        return natjuridica;
    }

    /**
     * <p>
     * Setter for the field <code>natjuridica</code>.</p>
     *
     * @param natjuridica a {@link java.lang.String} object.
     */
    public void setNatjuridica(String natjuridica) {
        this.natjuridica = natjuridica;
    }

    /**
     * <p>
     * Getter for the field <code>inicioatividade</code>.</p>
     *
     * @return a {@link java.util.Date} object.
     */
    public String getInicioatividade() {
        return inicioatividade;
    }

    /**
     * <p>
     * Setter for the field <code>inicioatividade</code>.</p>
     *
     * @param inicioatividade a {@link java.util.Date} object.
     */
    public void setInicioatividade(String inicioatividade) {
        this.inicioatividade = inicioatividade;
    }

    /**
     * <p>
     * Getter for the field <code>cnae</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCnae() {
        return cnae;
    }

    /**
     * <p>
     * Setter for the field <code>cnae</code>.</p>
     *
     * @param cnae a {@link java.lang.String} object.
     */
    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    /**
     * <p>
     * Getter for the field <code>tipologradouro</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTipologradouro() {
        return tipologradouro;
    }

    /**
     * <p>
     * Setter for the field <code>tipologradouro</code>.</p>
     *
     * @param tipologradouro a {@link java.lang.String} object.
     */
    public void setTipologradouro(String tipologradouro) {
        this.tipologradouro = tipologradouro;
    }

    /**
     * <p>
     * Getter for the field <code>logradouro</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * <p>
     * Setter for the field <code>logradouro</code>.</p>
     *
     * @param logradouro a {@link java.lang.String} object.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * <p>
     * Getter for the field <code>numero</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * <p>
     * Setter for the field <code>numero</code>.</p>
     *
     * @param numero a {@link java.lang.String} object.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * <p>
     * Getter for the field <code>complemento</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * <p>
     * Setter for the field <code>complemento</code>.</p>
     *
     * @param complemento a {@link java.lang.String} object.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * <p>
     * Getter for the field <code>bairro</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * <p>
     * Setter for the field <code>bairro</code>.</p>
     *
     * @param bairro a {@link java.lang.String} object.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * <p>
     * Getter for the field <code>cep</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCep() {
        return cep;
    }

    /**
     * <p>
     * Setter for the field <code>cep</code>.</p>
     *
     * @param cep a {@link java.lang.String} object.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * <p>
     * Getter for the field <code>uf</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUf() {
        return uf;
    }

    /**
     * <p>
     * Setter for the field <code>uf</code>.</p>
     *
     * @param uf a {@link java.lang.String} object.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * <p>
     * Getter for the field <code>codmunicipio</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCodmunicipio() {
        return codmunicipio;
    }

    /**
     * <p>
     * Setter for the field <code>codmunicipio</code>.</p>
     *
     * @param codmunicipio a {@link java.lang.String} object.
     */
    public void setCodmunicipio(String codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    /**
     * <p>
     * Getter for the field <code>municipio</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * <p>
     * Setter for the field <code>municipio</code>.</p>
     *
     * @param municipio a {@link java.lang.String} object.
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * <p>
     * Getter for the field <code>fone1</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFone1() {
        return fone1;
    }

    /**
     * <p>
     * Setter for the field <code>fone1</code>.</p>
     *
     * @param fone1 a {@link java.lang.String} object.
     */
    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    /**
     * <p>
     * Getter for the field <code>fone2</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFone2() {
        return fone2;
    }

    /**
     * <p>
     * Setter for the field <code>fone2</code>.</p>
     *
     * @param fone2 a {@link java.lang.String} object.
     */
    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    /**
     * <p>
     * Getter for the field <code>email</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * Setter for the field <code>email</code>.</p>
     *
     * @param email a {@link java.lang.String} object.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Getter for the field <code>qualiresp</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getQualiresp() {
        return qualiresp;
    }

    /**
     * <p>
     * Setter for the field <code>qualiresp</code>.</p>
     *
     * @param qualiresp a {@link java.lang.String} object.
     */
    public void setQualiresp(String qualiresp) {
        this.qualiresp = qualiresp;
    }

    /**
     * <p>
     * Getter for the field <code>capital</code>.</p>
     *
     * @return a {@link java.lang.Double} object.
     */
    public String getCapital() {
        return capital;
    }

    /**
     * <p>
     * Setter for the field <code>capital</code>.</p>
     *
     * @param capital a {@link java.lang.Double} object.
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * <p>
     * Getter for the field <code>porteempresa</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPorteempresa() {
        return porteempresa;
    }

    /**
     * <p>
     * Setter for the field <code>porteempresa</code>.</p>
     *
     * @param porteempresa a {@link java.lang.String} object.
     */
    public void setPorteempresa(String porteempresa) {
        this.porteempresa = porteempresa;
    }

    /**
     * <p>
     * Getter for the field <code>simples</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSimples() {
        return simples;
    }

    /**
     * <p>
     * Setter for the field <code>simples</code>.</p>
     *
     * @param simples a {@link java.lang.String} object.
     */
    public void setSimples(String simples) {
        this.simples = simples;
    }

    /**
     * <p>
     * Getter for the field <code>dataentradasimples</code>.</p>
     *
     * @return a {@link java.util.Date} object.
     */
    public String getDataentradasimples() {
        return dataentradasimples;
    }

    /**
     * <p>
     * Setter for the field <code>dataentradasimples</code>.</p>
     *
     * @param dataentradasimples a {@link java.util.Date} object.
     */
    public void setDataentradasimples(String dataentradasimples) {
        this.dataentradasimples = dataentradasimples;
    }

    /**
     * <p>
     * Getter for the field <code>datasaidasimples</code>.</p>
     *
     * @return a {@link java.util.Date} object.
     */
    public String getDatasaidasimples() {
        return datasaidasimples;
    }

    /**
     * <p>
     * Setter for the field <code>datasaidasimples</code>.</p>
     *
     * @param datasaidasimples a {@link java.util.Date} object.
     */
    public void setDatasaidasimples(String datasaidasimples) {
        this.datasaidasimples = datasaidasimples;
    }

    /**
     * <p>
     * Getter for the field <code>mei</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMei() {
        return mei;
    }

    /**
     * <p>
     * Setter for the field <code>mei</code>.</p>
     *
     * @param mei a {@link java.lang.String} object.
     */
    public void setMei(String mei) {
        this.mei = mei;
    }

    /**
     * <p>
     * Getter for the field <code>situacaoespecial</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSituacaoespecial() {
        return situacaoespecial;
    }

    /**
     * <p>
     * Setter for the field <code>situacaoespecial</code>.</p>
     *
     * @param situacaoespecial a {@link java.lang.String} object.
     */
    public void setSituacaoespecial(String situacaoespecial) {
        this.situacaoespecial = situacaoespecial;
    }

    /**
     * <p>
     * Getter for the field <code>datasitespecial</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDatasitespecial() {
        return datasitespecial;
    }

    /**
     * <p>
     * Setter for the field <code>datasitespecial</code>.</p>
     *
     * @param datasitespecial a {@link java.lang.String} object.
     */
    public void setDatasitespecial(String datasitespecial) {
        this.datasitespecial = datasitespecial;
    }
    private static final Logger LOG = Logger.getLogger(Cnpj.class.getName());

}
