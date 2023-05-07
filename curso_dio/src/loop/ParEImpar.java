package loop;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNuemeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.print("Quantidade de números : ");
        quantNuemeros = scan.nextInt();

        int count = 0;
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            // incrementa + 1 ao contador
            count++;

        } while (count < quantNuemeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}
