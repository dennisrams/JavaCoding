package br.com.treinaweb.main;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //int numero1 = Integer.parseInt(scanner.nextLine());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite a operação a ser feita: ");
        char operação = scanner.next().charAt(0);
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.printf("Voce quer fazer fazer a operação: %d %c %d?\n", numero1, operação, numero2);
        int resultado = 0;
         
        if(operação == '+'){
            resultado = numero1 + numero2;
            
        }

        else if(operação == '-'){
            resultado = numero1 - numero2;
            
        }

        else if(operação == '*'){ 
            resultado = numero1 * numero2;
            
        }

        else if(operação == '/'){
            resultado = numero1 / numero2;
        }

        else {
            System.out.println("\nOperador inválido!\n");
        }
        
        System.out.println(String.format("\n%d %c %d = %d\n", numero1, operação, numero2, resultado));
        
        scanner.close();
    }
}
