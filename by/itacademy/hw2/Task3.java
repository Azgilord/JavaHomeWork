package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args){
        int sec = 3600;
        int nedel = sec / 60 / 60 / 24 / 7;
        int dney = sec / 60 / 60 / 24 % 7;
        int hours = sec / 60 / 60 % 24;
        int min = sec / 60 %60;
        int secund = sec % 60;
        System.out.println("Недель:=" + nedel);
        System.out.println("дней:=" + dney);
        System.out.println("часов:=" + hours);
        System.out.println("минут:=" + min);
        System.out.println("секунд:=" + secund);

    }
}
