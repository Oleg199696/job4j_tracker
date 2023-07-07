package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error whatsap = new Error();
        Error vk = new Error(false, 2, "Hello");
        Error telegram = new Error(true, 1, "Bye");
        whatsap.printInfo();
        vk.printInfo();
        telegram.printInfo();
    }
}
