package io.khasang.polymorphism;

public abstract class Pet {
    String name;
    int age;



    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
