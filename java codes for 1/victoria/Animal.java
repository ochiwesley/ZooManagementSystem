/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.victoria;

/**
 *
 * @author ochie
 */
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The " + name + " makes a sound.");
    }

    public void eat() {
        System.out.println("The " + name + " is eating.");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("The " + name + " makes a sound.");
        }
    }

    public void eat(String foodType) {
        System.out.println("The " + name + " is eating " + foodType + ".");
    }

    public static void main(String[] args) {
        Animal lion = new Animal("Lion", 5);
        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("meat");
    }
}  
