package org.iesfm.animals.composition;

public class Cat implements Specie{
    private int remainingLives;

    public Cat(int remainingLives) {
        this.remainingLives = remainingLives;
    }

    @Override
    public void saySomething() {
        System.out.println("miau");
    }
}
