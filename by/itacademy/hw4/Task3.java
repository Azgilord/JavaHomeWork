package by.itacademy.hw4;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
            for (int i = 1; i <=n; i ++){
                result = result*i;
            }
        System.out.println("факториал числа "+n+" равен: " +result);
    }
}
