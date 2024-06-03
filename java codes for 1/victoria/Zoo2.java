/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.victoria;

/**
 *
 * @author ochie
 */
public class Zoo2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Lion("Lion", 5);
        animals[1] = new Elephant("Elephant", 10);
        animals[2] = new Monkey("Monkey", 3);

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.makeSound(2);
            animal.eat("food");
            System.out.println();
        }
    }
}
