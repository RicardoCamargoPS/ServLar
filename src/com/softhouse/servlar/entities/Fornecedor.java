package com.softhouse.servlar.entities;

public class Fornecedor {

    private String nome;
    private int CNPJ, telefone;
    private String nomeRepresentante;
    private String segmento;
    private boolean bloqueado;
    private double saldo;


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getNomeRepresentante() {
        return nomeRepresentante;
    }
    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }
    public String getSegmento() {
        return segmento;
    }
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
    public boolean isBloqueado() {
        return bloqueado;
    }
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    

    

}
