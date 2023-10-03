package com.Gustav.demo;

import com.Gustav.demo.models.Cat;
import com.Gustav.demo.models.Dog;
import com.Gustav.demo.models.Squirrel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Instantiate object

        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();

        benny.eat();// Abstract method
        benny.makeSound(); // ordinary method

        kasper.typeOfAnimal("Cat");
        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.sleep();
        kasper.makeSound();


        fido.typeOfAnimal("Dog");// Default method
        fido.name();
        fido.eat();
        fido.move();
        fido.sleep();
        fido.makeSound();


    }

}
