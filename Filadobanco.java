package Exerciciofimdesemana;
import java.util.Scanner;

public class Filadobanco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, esse programa irá realizar zerar a fila de espera de um banco");
        System.out.println("Quantas pessoas estão aguardando na fila?");
        int pessoasAguardando = entrada.nextInt();
        int contador = pessoasAguardando -1;

        while(contador <= pessoasAguardando && contador != -1) {
            System.out.println("O seu número na fila é: " + (contador+ 1));
            System.out.println("O número de pessoas aguardando no momento é: " + contador);


            contador--;
        }
    }
}
