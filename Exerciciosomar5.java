package Exerciciofimdesemana;

import java.util.Scanner;

public class Exerciciosomar5 {
    public static void main(String[] args) {
        System.out.println("Olá, esse programa irá realizar a soma de 5 números digitados pelo usuário");
        Scanner entrada = new Scanner(System.in);
        double soma =0;

        for (int numero = 1; numero <=5; numero++) {
            double numero1 = entrada.nextDouble();
            soma += numero1;

        }
        System.out.println("soma do resultado foi " + soma);



    }
}