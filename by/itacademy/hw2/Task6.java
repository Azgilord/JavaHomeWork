package by.itacademy.hw2;

public class Task6 {public static void main(String[] args) {
    int a = 56;
    int b = 38;
    int c = 42;
    if ((c <= b) && (b <= a)) {
        System.out.println(c);
    } else {
        if ((a <= c) && (a <= b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
}