package com.Gustav.demo.models;
// Abstract - Inheritance (arv)
//
//Uses keyword : implements
// All methods are by default 'public'
public interface Animal {



    //Abstract method
    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();


    // Default
   default void typeOfAnimal(String typeOfAnimal){
       System.out.println(typeOfAnimal);

    }


}
