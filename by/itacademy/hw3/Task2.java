package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 2 != 0) && (a > 0)) {
            System.out.println("нечетное положительное");
        } else if (((a % 2 == 0) && (a < 0))) {
                System.out.println("четное  отрицательное");
            }
        }
    }
