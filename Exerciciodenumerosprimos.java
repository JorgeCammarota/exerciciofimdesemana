package Exerciciofimdesemana;
import java.util.Scanner;

public class Exerciciodenumerosprimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, este programa irá pedir um número inteiro e determinar se é primo");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Digite um número inteiro: ");
        int numInt = entrada.nextInt();
        int divisor = 2;

        for (int j = 2; j < numInt; j++) {
            if (numInt % j == 0) {
                divisor++;
                System.out.println("O número foi: " + j);
            }
        }
        if(divisor == 2){
            System.out.println("Ele é um número primo! ");
        } else {
            System.out.println("Ele não é um número primo! ");
        }

    }
        }

