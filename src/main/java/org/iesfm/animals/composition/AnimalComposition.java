package org.iesfm.animals.composition;

import java.util.Objects;

public class AnimalComposition {
    public static final String MAMMAL_FAMILY = "mammal";
    public static final String REPTIL_FAMILY = "reptil";

    public static final String CARNIVOROUS_FEEDING = "carnivorous";
    public static final String HERBIVOROUS_FEEDING = "herbivorous";
    public static final String OMNIVOROUS_FEEDING = "omnivorous";

    private Specie specie;
    private String family;
    private String feeding;
    private String color;
    private int age;

    public AnimalComposition(Specie specie, String feeding, String color, int age) {
        this.specie = specie;
        this.feeding = feeding;
        this.color = color;
        this.age = age;
    }

    public void saySomething() {
        specie.saySomething();
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalComposition that = (AnimalComposition) o;
        return getAge() == that.getAge() && Objects.equals(getSpecie(), that.getSpecie()) && Objects.equals(getFeeding(), that.getFeeding()) && Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecie(), getFeeding(), getColor(), getAge());
    }
}
