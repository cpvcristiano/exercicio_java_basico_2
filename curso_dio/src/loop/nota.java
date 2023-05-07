package loop;
/*
 Faça um programa qque peça uma nota ,entre zero e dez.
 Moster uma mensagem caso o valor seja inválido 
 e continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.print("DIGITE UMA NOTA : ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Inválida!\nDigite Novamente: ");
            nota = scan.nextInt();

        }
        System.out.println("NUMERO DIGITADO : " + nota);
        System.out.println("O brigado por colabora !");
    }

}
