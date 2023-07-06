package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
       String value = switch (position) {
           case 1 -> "Пусть бегут неуклюже";
           case 2 -> "Спокойной ночи";
           default -> "Песня не найдена";
       };
        System.out.println(value);
    }

    public static void main(String[] args) {
        int number = 2;
        Jukebox song = new Jukebox();
        song.music(number);
    }
}
