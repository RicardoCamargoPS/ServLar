package com.softhouse.servlar.entities;

public class Insumos {

    private String nome, descricao, unidadeMedida;
    private int codigo;     
    private long precoCusto;
    private boolean fracionamento, disponivel;
    private String categoria, subCategoria, marca;
    private String fornecedor;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public long getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(long precoCusto) {
        this.precoCusto = precoCusto;
    }
    public boolean isFracionamento() {
        return fracionamento;
    }
    public void setFracionamento(boolean fracionamento) {
        this.fracionamento = fracionamento;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getSubCategoria() {
        return subCategoria;
    }
    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }



    
}
