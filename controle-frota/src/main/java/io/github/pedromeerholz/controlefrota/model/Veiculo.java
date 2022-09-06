package io.github.pedromeerholz.controlefrota.model;

public class Veiculo {
    private long codigo;
    private String placa;
    private String modelo;
    private String ano;
    private boolean status;

    public Veiculo(String placa, String modelo, String ano, boolean status) {
        setPlaca(placa);
        setModelo(modelo);
        setAno(ano);
        setStatus(status);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
