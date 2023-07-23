package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book deadSouls = new Book("Мертвые души", 500);
        Book warAndPeace = new Book("Война и мир", 1000);
        Book cleanCode = new Book("Clean code", 843);
        Book mumu = new Book("Муму", 125);
        Book[] books = new Book[4];
        books[0] = deadSouls;
        books[1] = warAndPeace;
        books[2] = cleanCode;
        books[3] = mumu;
        for (int index = 0; index < books.length; index++) {
            Book number = books[index];
            System.out.println(number.getName() + " - " + number.getCount());
        }
        Book rsl = books[0];
        books[0] = books[3];
        books[3] = rsl;
        for (int index = 0; index < books.length; index++) {
            Book number = books[index];
            System.out.println(number.getName() + " - " + number.getCount());
        }
        for (int index = 0; index < books.length; index++) {
            Book number = books[index];
            if ("Clean code".equals(number.getName())) {
                System.out.println(number.getName());
            }
        }
    }
}