package Exerciciofimdesemana;
import java.util.Scanner;
public class Exercicio6intervaloinvalido {
    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, este programa irá somar números ímpares contidos em um intervalo definido pelo usuário");
        System.out.println("Digite o valor inicial: ");
    int valorInicial = entrada.nextInt();

        System.out.println("Digite o valor final: ");
    int valorFinal = entrada.nextInt();
if (valorInicial > valorFinal){
        System.out.println("Intervalo de valores INVÁLIDO");
        System.exit(0);
    }

    int soma = 0;

        for (int i = valorInicial; i <= valorFinal; i++){
        if (i % 2 != 0) {
            soma += i;
        }
    }

        System.out.println("A soma dos números contidos no intervalo foi de: " + soma);
}
}
