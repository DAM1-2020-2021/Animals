package org.iesfm.animals;

import java.util.Objects;

public final class Dog extends Omnivorous {
    private String kind;

    public Dog(String color, int age, String kind) {
        super(color, age);
        this.kind = kind;
    }

//    @Override
//    public void eat() {
//        System.out.println("comiendo");
//    }

    @Override
    public void walk() {
        System.out.println("Dog walking");
    }

    @Override
    public void saySomething() {
        System.out.println("guau");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getKind(), dog.getKind());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getKind());
    }
}
