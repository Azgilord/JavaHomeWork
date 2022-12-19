package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("введите три стороны треугольника :");
        Scanner sc = new Scanner(System.in);
        int storona1 = sc.nextInt();
        int storona2 = sc.nextInt();
        int storona3 = sc.nextInt();
        if (storona1 <= 0 || storona2 <= 0 || storona3 <= 0) {
            System.out.println("стороны введены некоректно");
        } else if ((storona1 < (storona2 + storona3)) && (storona2 < (storona1 + storona3) && (storona3 < (storona2 + storona1)))) {
                System.out.println("такой треугольник существует");
            } else {
                System.out.println("такого треугольника нет");
            }
        }
    }
