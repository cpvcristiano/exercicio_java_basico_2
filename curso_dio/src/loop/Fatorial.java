package loop;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * 1;

        }

        System.out.println(multiplicacao);
    }

}
