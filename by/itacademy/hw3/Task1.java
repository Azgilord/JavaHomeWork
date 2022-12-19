package by.itacademy.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println(a);
        }
    }
}
