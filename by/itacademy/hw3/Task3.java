package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.print("введите число от 1 до 7:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day < 1 || day > 7) {
            System.out.print("введено не верное число");
        } else {
            switch (day) {
                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                case 6:
                    System.out.println("выходной");
                    break;
                case 7:
                    System.out.println("выходной");
                    break;
            }
        }
    }
}
