package com.aluracursos.conversordemoedas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        List<Conversao> conversoes = new ArrayList<>();

        while (true) {
            System.out.println("***************************************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda =]");
            System.out.println("1) Dolar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dolar");
            System.out.println("5) Dolar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dolar");
            System.out.println("7) Sair");
            System.out.println("***************************************************");
            System.out.println("Escolha uma opcao valida:");

            var opcao = leitura.nextInt();

            if (opcao == 7) {
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            var valor = leitura.nextDouble();

            String moedaBase = "";
            String moedaAlvo = "";

            switch (opcao) {
                case 1:
                    moedaBase = "USD";
                    moedaAlvo = "ARS";
                    break;
                case 2:
                    moedaBase = "ARS";
                    moedaAlvo = "USD";
                    break;
                case 3:
                    moedaBase = "USD";
                    moedaAlvo = "BRL";
                    break;
                case 4:
                    moedaBase = "BRL";
                    moedaAlvo = "USD";
                    break;
                case 5:
                    moedaBase = "USD";
                    moedaAlvo = "COP";
                    break;
                case 6:
                    moedaBase = "COP";
                    moedaAlvo = "USD";
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    continue;
            }

            try {
                Moeda moeda = consulta.buscaMoeda(moedaBase);
                double taxa = moeda.conversion_rates().get(moedaAlvo);
                double resultado = valor * taxa;
                System.out.printf("Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n", valor, moedaBase, resultado, moedaAlvo);
                conversoes.add(new Conversao(moedaBase, moedaAlvo, valor, resultado));
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicação.");
            }
        }

        GeradorDeArquivo gerador = new GeradorDeArquivo();
        try {
            gerador.salvaJson(conversoes);
            System.out.println("Histórico de conversões salvo em conversoes.json");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o histórico de conversões.");
        }

        leitura.close();
        System.out.println("Programa finalizado.");
    }
}
