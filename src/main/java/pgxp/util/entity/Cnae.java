/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgxp.util.entity;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author gladson
 */
public class Cnae implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;

    private String atividade;
    private String subclasseId;
    private String subclasse;
    private String classeId;
    private String classe;
    private String grupoId;
    private String grupo;
    private String divisaoId;
    private String divisao;
    private String secaoId;
    private String secao;
    private String observacao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getSubclasseId() {
        return subclasseId;
    }

    public void setSubclasseId(String subclasseId) {
        this.subclasseId = subclasseId;
    }

    public String getSubclasse() {
        return subclasse;
    }

    public void setSubclasse(String subclasse) {
        this.subclasse = subclasse;
    }

    public String getClasseId() {
        return classeId;
    }

    public void setClasseId(String classeId) {
        this.classeId = classeId;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDivisaoId() {
        return divisaoId;
    }

    public void setDivisaoId(String divisaoId) {
        this.divisaoId = divisaoId;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public String getSecaoId() {
        return secaoId;
    }

    public void setSecaoId(String secaoId) {
        this.secaoId = secaoId;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
