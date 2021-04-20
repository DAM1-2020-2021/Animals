package org.iesfm.animals;

public class Snake extends Carnivorous{
    public Snake(String color, int age) {
        super(color, age);
    }

    @Override
    public void saySomething() {
        System.out.println("zzzzzz");
    }

    @Override
    public void walk() {
        System.out.println("reptando");
    }
}
