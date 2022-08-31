package io.github.pedromeerholz.controlefrota.model;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Funcionario(int codigo, String nome, String cpf, String dataNascimento) {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
