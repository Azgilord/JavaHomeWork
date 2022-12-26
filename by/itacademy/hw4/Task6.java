package by.itacademy.hw4;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
    int[] ar = {22, 10, -32, -55, 4, -55, -25, 105, 120, -46, 0, 99, -18};
    separate(ar);
}
    private static void separate(int[] ar) {
        int positive = 0;
        int negative = 0;
        for (int elem : ar) {
            if (elem > 0) positive++;
            else if (elem < 0) negative++;
        }

        int[] allPositive = new int[positive];
        int[] allNegative = new int[negative];
        positive = 0;
        negative = 0;
        for (int elem : ar) {
            if (elem > 0) allPositive[positive++] = elem;
            else if (elem < 0) allNegative[negative++] = elem;
        }
        System.out.println("положительные: " + Arrays.toString(allPositive));
        System.out.println("отрицательные: " + Arrays.toString(allNegative));
    }
}
