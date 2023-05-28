package Exerciciofimdesemana;
import java.util.Scanner;
public class Calcular2notasdealuno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = calcularMedia(nota1, nota2);

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
        else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}
