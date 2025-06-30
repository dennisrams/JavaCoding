package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("DIgite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println(nome);
        scanner.close();
    }
}
