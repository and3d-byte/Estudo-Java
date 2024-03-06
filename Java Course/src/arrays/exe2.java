package arrays;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas deseja armazenar: ");
        int indice = entrada.nextInt();
        double[] notas = new double[indice];

        for (int i = 0; i < indice; i++){
            System.out.println("Digite a nota do " + (i + 1) + " Aluno: ");
            notas[i] = entrada.nextInt();
        }

        double total = 0;
        for(double j : notas){
            total += j;
        }

        System.out.println("Média das notas de: " + total / notas.length);
    }
}
