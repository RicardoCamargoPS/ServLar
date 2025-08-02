package com.softhouse.servlar.entities;

public class Colaborador {

    private String nome;
    private int RG, CPF, tempoServico;
    private String funcao, setor, turno;
    private String dataContratacao, dataNascimento;
    private boolean temFeriasVencida;
    private double salario;
    private boolean usuarioSistema;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRG() {
        return RG;
    }
    public void setRG(int rG) {
        RG = rG;
    }
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }
    public int getTempoServico() {
        return tempoServico;
    }
    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public boolean isTemFeriasVencida() {
        return temFeriasVencida;
    }
    public void setTemFeriasVencida(boolean temFeriasVencida) {
        this.temFeriasVencida = temFeriasVencida;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean isUsuarioSistema() {
        return usuarioSistema;
    }
    public void setUsuarioSistema(boolean usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    

}
