package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        String eng = "Family";
        DummyDic word = new DummyDic();
        String say = word.engToRus(eng);
        System.out.println(say);
    }
}
