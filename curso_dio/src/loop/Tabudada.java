package loop;
/*
Desenvolva um gerador de tabuada , capaz de gerar a tabuada de qualaquer numero inteiro entre 1 a 10 . 
O usuário deve informar de qual numero elem desja ver a tabuada .
A saída deve srer conforme o exemplo abaixo.
 */

import java.util.Scanner;

public class Tabudada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

    }
}
