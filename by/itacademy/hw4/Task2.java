package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pr = 1;
        int sum = 0;
        int a = sc.nextInt();
        while (a != 0) {
            pr = pr * (a % 10);
            sum += (a % 10);
            a /= 10;
        }
        System.out.println("произведение = " + pr);
        System.out.println("сумма= " + sum);
    }
}

