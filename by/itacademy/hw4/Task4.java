package by.itacademy.hw4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * (100));
            System.out.print(ar[i] + " ");
            if (ar[i] > ar[max]) {
                max = i;
            } else if (ar[i] < ar[min]) {
                min = i;
            }
        }
        System.out.println("\n"+"индекс максимального числа =" + max + "\n"+"индекс минимального числа=" + min);

    }
}

