package com.softhouse.servlar.entities;

public class Produto {

    private int codigoSKU, codigoEAN13;  
    private String nome, descricao, unidadeMedida;
    private long precoCusto, precoVenda;
    private boolean fracionamento, disponivel;
    private String categoria, subCategoria, marca;
    private String ncm, origem, fornecedor;

    
    public Produto(int codigoSKU, int codigoEAN13, String nome, String descricao, String unidadeMedida, long precoCusto,
            long precoVenda, boolean fracionamento, boolean disponivel, String categoria, String subCategoria,
            String marca, String ncm, String origem, String fornecedor) {
        this.codigoSKU = codigoSKU;
        this.codigoEAN13 = codigoEAN13;
        this.nome = nome;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.fracionamento = fracionamento;
        this.disponivel = disponivel;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.marca = marca;
        this.ncm = ncm;
        this.origem = origem;
        this.fornecedor = fornecedor;
    }
    public Produto(int codigoSKU, int codigoEAN13, String nome, String unidadeMedida, long precoCusto, long precoVenda,
            boolean disponivel, String marca, String fornecedor) {
        this.codigoSKU = codigoSKU;
        this.codigoEAN13 = codigoEAN13;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.disponivel = disponivel;
        this.marca = marca;
        this.fornecedor = fornecedor;
    }
    public Produto(int codigoSKU, String nome, String unidadeMedida, long precoCusto, long precoVenda) {
        this.codigoSKU = codigoSKU;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }
    public void setCodigoSKU(int codigoSKU) {
        this.codigoSKU = codigoSKU;
    }
    public void setCodigoEAN13(int codigoEAN13) {
        this.codigoEAN13 = codigoEAN13;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    public void setPrecoCusto(long precoCusto) {
        this.precoCusto = precoCusto;
    }
    public void setPrecoVenda(long precoVenda) {
        this.precoVenda = precoVenda;
    }
    public void setFracionamento(boolean fracionamento) {
        this.fracionamento = fracionamento;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setNcm(String ncm) {
        this.ncm = ncm;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public int getCodigoSKU() {
        return codigoSKU;
    }
    public int getCodigoEAN13() {
        return codigoEAN13;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public long getPrecoCusto() {
        return precoCusto;
    }
    public long getPrecoVenda() {
        return precoVenda;
    }
    public boolean isFracionamento() {
        return fracionamento;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getSubCategoria() {
        return subCategoria;
    }
    public String getMarca() {
        return marca;
    }
    public String getNcm() {
        return ncm;
    }
    public String getOrigem() {
        return origem;
    }
    public String getFornecedor() {
        return fornecedor;
    }    

}
