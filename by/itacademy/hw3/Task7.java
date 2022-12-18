package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("введите два целых однозначных числа:");
        Scanner sc = new Scanner(System.in);
        int pervoe = sc.nextInt();
        int vtoroe = sc.nextInt();
        if ((pervoe > 9) || (pervoe == 0) || (pervoe < -9) || (vtoroe > 9) || (vtoroe < -9) || (vtoroe == 0)) {
            System.out.println("числа введены не верно");
        }else {
        System.out.println("каков результат умножения первого числа на второе?");
        int resultat = sc.nextInt();
            if (pervoe * vtoroe == resultat) {
                System.out.println("ответ верен");
            } else {
                System.out.println("неправильно, правильный ответ:" + (pervoe * vtoroe));
            }
        }
    }
}

