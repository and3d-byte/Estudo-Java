package arrays;

import java.util.Arrays;

public class exe1 {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 10;
        notasAlunoA[3] = 1.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (double v : notasAlunoA) {
            total += v;
        }

        System.out.println(total / notasAlunoA.length);

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        double totalB = 0;
        for (double i : notasAlunoB){
            totalB += i;
        }

        System.out.println(totalB / notasAlunoB.length);
    }
}
