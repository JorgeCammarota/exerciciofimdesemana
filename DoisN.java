package Exerciciofimdesemana;
import java.util.Scanner;
public class DoisN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double maiorNumero = encontrarMaior(numero1, numero2);
        System.out.println("O maior número é: " + maiorNumero);
    }

    public static double encontrarMaior(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }
}
