package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // int numero1 = Integer.parseInt(scanner.nextLine());
        Scanner scanner = new Scanner(System.in);
        int acao = 1; // 0 - Sair. 1 = Operação, 2 - Historico
        ArrayList<String> historico = new ArrayList<String>();
        while (acao > 0) {
            if (acao == 1) {
                System.out.println("=== Operação Matemática ===");
                System.out.println("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                System.out.println("Digite a operação a ser feita: ");
                char operação = scanner.next().charAt(0);
                System.out.println("Digite o segundo número: ");
                int numero2 = scanner.nextInt();

                System.out.printf("Voce quer fazer fazer a operação: %d %c %d?\n", numero1, operação, numero2);
                int resultado = 0;
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

                    default:
                        System.out.println("Operador inválido!");
                        break;
                }


                String entradaHistorico = String.format("\n%d %c %d = %d\n", numero1, operação, numero2, resultado);

                historico.add(entradaHistorico);

                System.out.println(entradaHistorico);
            } else if(acao == 2){
                System.out.println("=== Histórico ===");
                System.out.println(String.format(" - Você já fez %d operações - ", historico.size()));
                historico.forEach(itemHistorico -> System.out.println(itemHistorico));

                // for(int i = 0; i < historico.size(); i++){
                //     System.out.println(historico.get(i));
                // }

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
