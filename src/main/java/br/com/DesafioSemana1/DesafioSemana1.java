package br.com.DesafioSemana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioSemana1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de números separados por espaço:");
        String entrada = scanner.nextLine();

        if (entrada.trim().isEmpty()) {
            System.out.println("Erro: nenhuma informação foi digitada.");
            scanner.close();
            return;
        }

        String[] valores = entrada.split(" ");
        List<Double> numeros = new ArrayList<>();

        for (String valor : valores) {
            try {
                double numero = Double.parseDouble(valor);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido ignorado: " + valor);
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("Erro: nenhum número válido foi informado.");
            scanner.close();
            return;
        }

        double soma = 0;
        double maior = numeros.get(0);
        double menor = numeros.get(0);

        for (double num : numeros) {
            soma += num;

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        double media = soma / numeros.size();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}
