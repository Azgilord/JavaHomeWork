package by.itacademy.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("введите три числа :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((c < b) && (b < a)) {
            System.out.println(c + " " + b + " " + a);
        } else if ((c < a) && (a < b)) {
            System.out.println(c + " " + a + " " + b);
        } else if ((a < b) && (b < c)) {
            System.out.println(a + " " + b + " " + c);
        } else if ((a < c) && (c < b)) {
            System.out.println(a + " " + c + " " + b);
        } else if ((b < c) && (c < a)) {
            System.out.println(b + " " + c + " " + a);
        } else if ((b < a) && (a < c)) {
            System.out.println(b + " " + a + " " + c);
        }
    }
}





