/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author marcal
 */
public class Produto {
    
    private int id;
    private String descricao;
    private String fornecedor;
    private float precoOrig;
    private float precoFin;
    private int qnt;
    private int limite;
    private String medida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPrecoOrig() {
        return precoOrig;
    }

    public void setPrecoOrig(float precoOrig) {
        this.precoOrig = precoOrig;
    }

    public float getPrecoFin() {
        return precoFin;
    }

    public void setPrecoFin(float precoFin) {
        this.precoFin = precoFin;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    
}
