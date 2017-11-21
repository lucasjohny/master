package br.com.projeto.App.repository;

/**
 * @author lucas
 */
public class ContaVO {

    private Integer conta = -1;
    private String nome = "";
    private String data = "";
    private double valor = -1;
    private Integer tipoLancamento = -1;

    public Integer getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getTipoDeLancamento() {
        return tipoLancamento;
    }

    public void setTipoDeLancamento(Integer tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

}
