package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " ate " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's name and food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Petya");
        gav.show();
        System.out.println("There are black's name and food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Vasya");
        black.show();
    }
}