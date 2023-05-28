package Exerciciofimdesemana;
import java.util.Scanner;
public class Encontraroprodutomaisbarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double produto1 = scanner.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double produto2 = scanner.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double produto3 = scanner.nextDouble();
        String produtoMaisBarato = encontrarProdutoMaisBarato(produto1, produto2, produto3);
        System.out.println("Você deve comprar o produto: " + produtoMaisBarato);
    }
    public static String encontrarProdutoMaisBarato(double produto1, double produto2, double produto3) {
        if (produto1 <= produto2 && produto1 <= produto3) {
            return "Produto 1";
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            return "Produto 2";
        } else {
            return "Produto 3";
        }
    }
}
