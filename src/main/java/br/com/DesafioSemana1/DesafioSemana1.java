package br.com.DesafioSemana1;


import java.util.Scanner;

public class DesafioSemana1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de números separados por espaço:");
        String entrada = scanner.nextLine();

        System.out.println("Você digitou:");
        System.out.println(entrada);

        scanner.close();
    }
}