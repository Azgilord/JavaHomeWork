package by.itacademy.hw5.Task2;

public class Phone {
    private long number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public void sendMessage(long... arg) {
        for (long x : arg) {
            System.out.println("Номер телефона на который будет отправлено СМС " + x);
        }
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCallp(String name, long number) {
        System.out.println("Звонит " + name + " с номера: " + number);
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
