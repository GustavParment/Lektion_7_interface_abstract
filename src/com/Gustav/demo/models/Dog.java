package com.Gustav.demo.models;

public class Dog implements Animal {
    @Override
    public void name() {
        System.out.println("Fido");

    }

    @Override
    public void move() {
        System.out.println("Runs frantically");

    }

    @Override
    public void eat() {
        System.out.println("Devours everything");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 50% of the time");

    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof, bark bark");

    }
}
