package by.itacademy.hw5.Task2;

import by.itacademy.hw5.Task1.Person;

public class Main {
    public static void main(String[] ph) {
        Phone sony = new Phone(80297654833l, "k800", 320);
        Phone nokia = new Phone(80295678478l, "z320");
        Phone iphone = new Phone();
        sony.receiveCall("Ivan");
        sony.receiveCallp("Sergey", sony.getNumber());
        nokia.sendMessage( nokia.getNumber());
        System.out.println(nokia.getModel());
        System.out.println(iphone.getModel());

    }
}
