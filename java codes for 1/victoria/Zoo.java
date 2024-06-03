/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.victoria;

/**
 *
 * @author ochie
 */
public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion", 5);
        Elephant elephant = new Elephant("Elephant", 10);
        Monkey monkey = new Monkey("Monkey", 3);

        lion.makeSound();
        lion.eat();

        elephant.makeSound();
        elephant.eat();

        monkey.makeSound();
        monkey.eat();
    }
}

