package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("введите число от 0 до 59 :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0 || a > 59) {
            System.out.println("число введено не верно");
        } else {
            if (a <= 15) {
                System.out.println("первая четверть часа");
            } else {
                if (a >= 15 && a <= 30) {
                    System.out.println("вторая четверть часа");
                } else {
                    if (a >= 30 && a <= 45) {
                        System.out.println("третья четверть часа");
                    } else {
                        if (a >= 45 && a <= 59) {
                            System.out.println("четвертая четверть часа");
                        }
                    }
                }
            }
        }
    }
}
