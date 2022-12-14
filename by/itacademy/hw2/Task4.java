package by.itacademy.hw2;

public class Task4 {
    public static void main(String[] args) {

        System.out.println(tobyteFromShort((short) 120055));
    } //при приобразовании to byte from short требуется указать тип переменной byte или short чтобы ошибки не было

    static int toshort(int a) {
        return a = (short) a;
    }

    static short tobyteFromShort(short a) {
        return a = (byte) a;
    }

    static long toint(long a) {
        return a = (int) a;
    }
}



