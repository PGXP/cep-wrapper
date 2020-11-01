/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgxp.util.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * <p>Socios class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
public class Socios implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String cnpj;
    private String idsocio;
    private String nomesocio;
    private String cpfcnpj;
    private String qualisocio;
    private String percentcap;
    private Date dataentrada;
    private String codpais;
    private String nomepais;
    private String cpfrepresentante;
    private String nomerepresentante;
    private String qualirepresentante;

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.util.UUID} object.
     */
    public UUID getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.util.UUID} object.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>cnpj</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * <p>Setter for the field <code>cnpj</code>.</p>
     *
     * @param cnpj a {@link java.lang.String} object.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * <p>Getter for the field <code>idsocio</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getIdsocio() {
        return idsocio;
    }

    /**
     * <p>Setter for the field <code>idsocio</code>.</p>
     *
     * @param idsocio a {@link java.lang.String} object.
     */
    public void setIdsocio(String idsocio) {
        this.idsocio = idsocio;
    }

    /**
     * <p>Getter for the field <code>nomesocio</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNomesocio() {
        return nomesocio;
    }

    /**
     * <p>Setter for the field <code>nomesocio</code>.</p>
     *
     * @param nomesocio a {@link java.lang.String} object.
     */
    public void setNomesocio(String nomesocio) {
        this.nomesocio = nomesocio;
    }

    /**
     * <p>Getter for the field <code>cpfcnpj</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCpfcnpj() {
        return cpfcnpj;
    }

    /**
     * <p>Setter for the field <code>cpfcnpj</code>.</p>
     *
     * @param cpfcnpj a {@link java.lang.String} object.
     */
    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    /**
     * <p>Getter for the field <code>qualisocio</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getQualisocio() {
        return qualisocio;
    }

    /**
     * <p>Setter for the field <code>qualisocio</code>.</p>
     *
     * @param qualisocio a {@link java.lang.String} object.
     */
    public void setQualisocio(String qualisocio) {
        this.qualisocio = qualisocio;
    }

    /**
     * <p>Getter for the field <code>percentcap</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPercentcap() {
        return percentcap;
    }

    /**
     * <p>Setter for the field <code>percentcap</code>.</p>
     *
     * @param percentcap a {@link java.lang.String} object.
     */
    public void setPercentcap(String percentcap) {
        this.percentcap = percentcap;
    }

    /**
     * <p>Getter for the field <code>dataentrada</code>.</p>
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getDataentrada() {
        return dataentrada;
    }

    /**
     * <p>Setter for the field <code>dataentrada</code>.</p>
     *
     * @param dataentrada a {@link java.util.Date} object.
     */
    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    /**
     * <p>Getter for the field <code>codpais</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCodpais() {
        return codpais;
    }

    /**
     * <p>Setter for the field <code>codpais</code>.</p>
     *
     * @param codpais a {@link java.lang.String} object.
     */
    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    /**
     * <p>Getter for the field <code>nomepais</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNomepais() {
        return nomepais;
    }

    /**
     * <p>Setter for the field <code>nomepais</code>.</p>
     *
     * @param nomepais a {@link java.lang.String} object.
     */
    public void setNomepais(String nomepais) {
        this.nomepais = nomepais;
    }

    /**
     * <p>Getter for the field <code>cpfrepresentante</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCpfrepresentante() {
        return cpfrepresentante;
    }

    /**
     * <p>Setter for the field <code>cpfrepresentante</code>.</p>
     *
     * @param cpfrepresentante a {@link java.lang.String} object.
     */
    public void setCpfrepresentante(String cpfrepresentante) {
        this.cpfrepresentante = cpfrepresentante;
    }

    /**
     * <p>Getter for the field <code>nomerepresentante</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNomerepresentante() {
        return nomerepresentante;
    }

    /**
     * <p>Setter for the field <code>nomerepresentante</code>.</p>
     *
     * @param nomerepresentante a {@link java.lang.String} object.
     */
    public void setNomerepresentante(String nomerepresentante) {
        this.nomerepresentante = nomerepresentante;
    }

    /**
     * <p>Getter for the field <code>qualirepresentante</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getQualirepresentante() {
        return qualirepresentante;
    }

    /**
     * <p>Setter for the field <code>qualirepresentante</code>.</p>
     *
     * @param qualirepresentante a {@link java.lang.String} object.
     */
    public void setQualirepresentante(String qualirepresentante) {
        this.qualirepresentante = qualirepresentante;
    }
    private static final Logger LOG = Logger.getLogger(Socios.class.getName());

}
