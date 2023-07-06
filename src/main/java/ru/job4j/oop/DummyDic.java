package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String line = "Неизвестное слово. " + eng;
        return line;
    }

    public static void main(String[] args) {
        String eng = "Family";
        DummyDic word = new DummyDic();
        String say = word.engToRus(eng);
        System.out.println(say);
    }
}
