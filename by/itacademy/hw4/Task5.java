package by.itacademy.hw4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * (4));
            System.out.print(ar[i] + " ");
            if (ar[i] < ar[min] & i % 2 != 0) {
                min = i;
            }
        }
        System.out.println("\n" + " минимальное число с нечетным индексом " + ar[min]);
    }
}
