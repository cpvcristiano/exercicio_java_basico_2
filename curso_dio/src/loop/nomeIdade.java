package loop;
/* 
 Faça um programa que leia conjuntos de dosi valores ,  o primeiro representando o nome do aluno a sua idade.
 */

import java.util.Scanner;

public class nomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String sobrenome;
        int idade;

        while (true) {
            System.out.println("DIGITE SEU NOME: ");
            nome = scan.next();

            if (nome.equals("0"))
                break;

            System.out.println("DIGITE SEU SOBRENOME: ");
            sobrenome = scan.next();
            System.out.println("DIGITE SUA IDADE: ");
            idade = scan.nextInt();

            String nomeCompleto = nome + " " + sobrenome;

            System.out.println("NOME COMPLETO : " + nomeCompleto);
            System.out.println("IDADE: " + idade);

        }

        System.out.println("Fim do sistema !");

    }
}