package com.aluracursos.conversordemoedas;

public class Conversao {
    private String moedaBase;
    private String moedaAlvo;
    private double valor;
    private double resultado;

    public Conversao(String moedaBase, String moedaAlvo, double valor, double resultado) {
        this.moedaBase = moedaBase;
        this.moedaAlvo = moedaAlvo;
        this.valor = valor;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Conversao{" +
                "moedaBase='" + moedaBase + '\'' +
                ", moedaAlvo='" + moedaAlvo + '\'' +
                ", valor=" + valor +
                ", resultado=" + resultado +
                '}';
    }
}
