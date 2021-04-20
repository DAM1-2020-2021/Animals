package org.iesfm.animals;

import java.util.Objects;

public final class Cat extends Carnivorous {
    private int remainingLives;

    public Cat(String color, int age, int remainingLives) {
        super(color, age);
        this.remainingLives = remainingLives;
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void saySomething() {
        System.out.println("Miau");
    }

    public void kill() {
        remainingLives--;
        System.out.println("Solo me quedan " + remainingLives +" vidas");
    }

    public int getRemainingLives() {
        return remainingLives;
    }

    public void setRemainingLives(int remainingLives) {
        this.remainingLives = remainingLives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return getRemainingLives() == cat.getRemainingLives();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRemainingLives());
    }
}
