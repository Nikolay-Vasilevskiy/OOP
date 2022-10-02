package oop_dz_2;

/**
 * В классе `Human` описана модель человека с полями имя и возраст
 */
public abstract class Human {

    protected String name;
    protected int age;
    protected Commands command;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", age: " + this.age);
    }
}
