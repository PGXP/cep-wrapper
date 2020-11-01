/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgxp.util.entity;

import java.io.Serializable;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 * <p>Cep class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
public class Cep implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = getLogger(Cep.class.getName());

    private Integer id;
    private String logradouro;
    private String cep;
    private String uf;
    private String cidade;
    private String bairroIni;
    private String bairroFim;

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.lang.Integer} object.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>logradouro</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * <p>Setter for the field <code>logradouro</code>.</p>
     *
     * @param logradouro a {@link java.lang.String} object.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * <p>Getter for the field <code>cep</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCep() {
        return cep;
    }

    /**
     * <p>Setter for the field <code>cep</code>.</p>
     *
     * @param cep a {@link java.lang.String} object.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * <p>Getter for the field <code>uf</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUf() {
        return uf;
    }

    /**
     * <p>Setter for the field <code>uf</code>.</p>
     *
     * @param uf a {@link java.lang.String} object.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * <p>Getter for the field <code>cidade</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * <p>Setter for the field <code>cidade</code>.</p>
     *
     * @param cidade a {@link java.lang.String} object.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * <p>Getter for the field <code>bairroIni</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBairroIni() {
        return bairroIni;
    }

    /**
     * <p>Setter for the field <code>bairroIni</code>.</p>
     *
     * @param bairroIni a {@link java.lang.String} object.
     */
    public void setBairroIni(String bairroIni) {
        this.bairroIni = bairroIni;
    }

    /**
     * <p>Getter for the field <code>bairroFim</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBairroFim() {
        return bairroFim;
    }

    /**
     * <p>Setter for the field <code>bairroFim</code>.</p>
     *
     * @param bairroFim a {@link java.lang.String} object.
     */
    public void setBairroFim(String bairroFim) {
        this.bairroFim = bairroFim;
    }

}
