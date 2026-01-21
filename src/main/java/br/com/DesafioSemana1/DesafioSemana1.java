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

        System.out.println("Números convertidos:");
        System.out.println(numeros);

        scanner.close();
    }
}
