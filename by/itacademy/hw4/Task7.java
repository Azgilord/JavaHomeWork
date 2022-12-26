package by.itacademy.hw4;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Первоночальный вариант ");
        int n = 10;
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = (int) (Math.random() * (100));
            System.out.print(ar[i] + " ");
        }
        for (int i = 0; i < n / 2; i++) {
            int j = ar[i];
            ar[i] = ar[n - 1 - i];
            ar[n - 1 - i] = j;
        }
        System.out.println("\n " + "Перевернутый варинат ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}

