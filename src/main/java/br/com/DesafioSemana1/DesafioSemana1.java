package br.com.DesafioSemana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioSemana1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de números separados por espaço:");
        String entrada = scanner.nextLine();

        String[] valores = entrada.split(" ");

        List<Double> numeros = new ArrayList<>();

        for (String valor : valores) {
            double numero = Double.parseDouble(valor);
            numeros.add(numero);
        }

        double soma = 0;

        for(double num : numeros) {
            soma += num;
        }

        double media = soma / numeros.size();

        double maior = numeros.get(0);
        double menor = numeros.get(0);

        for(double num : numeros) {
            if(num > maior) {
                maior = num;
            }
            if(num < menor) {
                menor = num;
            }
        }

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números:" + media);
        System.out.println("Maior número:" + maior);
        System.out.println("Menor número:" + menor);

        scanner.close();
    }
}
