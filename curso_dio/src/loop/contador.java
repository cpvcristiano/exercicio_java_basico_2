package loop;

import java.util.Scanner;

/*
 Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
public class contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.print("Número : ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("O Maior número : " + maior);
        System.out.print("A média : " + (soma / 5));
    }
}
