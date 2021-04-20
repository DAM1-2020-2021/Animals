package org.iesfm.animals;

import java.util.Objects;

public final class Pig extends Omnivorous {

    private int weight;

    public Pig(String color, int age, int weight) {
        super(color, age);
        this.weight = weight;
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void saySomething() {
        System.out.println("Oink");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pig pig = (Pig) o;
        return getWeight() == pig.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }
}
