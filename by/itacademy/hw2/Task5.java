package by.itacademy.hw2;

public class Task5 {
    public static void main(String[] args) {
        int a = 1230;
        if (((a % 2) == 0) && (a != 0)) {
            System.out.println("четное");
        } else {
            if (a == 0) {
                System.out.println("это число ноль");
            } else {
                System.out.println("нечетное");
            }
        }
    }
}
