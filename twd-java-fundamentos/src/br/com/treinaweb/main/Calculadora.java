package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao = 1; 
        ArrayList<String> historico = new ArrayList<String>();
        while (acao > 0) {
            if (acao == 1) {
                System.out.println("=== Operação Matemática ===");
                System.out.println("Digite o primeiro número: ");
                float numero1 = 0;
                try {
                    numero1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println(String.format(
                            "Ocorreu um erro de formato: %s. O primeiro número precisa ser inteiro.", e.getMessage()));
                    numero1 = 1;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Erro desconhecido.");
                }

                System.out.println("Digite a operação a ser feita: ");
                char operação = scanner.next().charAt(0);

                System.out.println("Digite o segundo número (em caso de raiz quadrada, digite 0): ");
                float numero2 = 0;
                try {
                    numero2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ocorreu um erro de formato: %s. O primeiro número precisa ser inteiro.");
                } catch (Exception e) {
                    System.out.println("Erro desconhecido.");
                }

                System.out.printf("Voce quer fazer fazer a operação: %.2f %c %.2f?\n", numero1, operação, numero2);
                double resultado = 0;
                switch (operação) {
                    case '+':
                        resultado = numero1 + numero2;
                        break;

                    case '-':
                        resultado = numero1 - numero2;
                        break;

                    case '*':
                        resultado = numero1 * numero2;
                        break;

                    case '/':
                        resultado = numero1 / numero2;
                        break;

                    case '%':
                        resultado = numero1 % numero2;
                        break;

                    case '^':
                        resultado = Math.pow(numero1, numero2);
                        break;

                    case '√':
                        resultado = Math.sqrt(numero1);
                        break;

                    default:
                        System.out.println("Operador inválido!");
                        break;
                }

                String entradaHistorico = String.format("\n%.2f %c %.2f = %.2f\n", numero1, operação, numero2,
                        resultado);

                historico.add(entradaHistorico);

                System.out.println(entradaHistorico);
            } else if (acao == 2) {
                System.out.println("=== Histórico ===");
                System.out.println(String.format(" - Você já fez %d operações - ", historico.size()));
                historico.forEach(itemHistorico -> System.out.println(itemHistorico));
            }
            System.out.println("=== O que deseja fazer agora? ===");
            System.out.println("1. Realizar outra operação\n2.Visualizar histórico\n0.Sair");
            System.out.print("Sua opção: ");
            acao = scanner.nextInt();
        }
        System.out.println("Tchau!");
        scanner.close();
    }
}