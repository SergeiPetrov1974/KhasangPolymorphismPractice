package io.khasang.polymorphism;

public abstract class Animal extends Object {
    String name;
    int age;

    void sleep() {
        System.out.println("I am sleeping");
    }

    abstract void feed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
