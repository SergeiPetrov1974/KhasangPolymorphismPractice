package io.khasang.polymorphism;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        //System.out.println(animal); //пример полиморфизма

        Cat cat = new Cat();
        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[0].feed();
        animals[1] = new Cow();
        animals[1].feed();
    }
}
