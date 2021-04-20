package org.iesfm.animals.composition;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnimalComposition cat = new AnimalComposition(
                AnimalComposition.CAT_SPECIE,
                AnimalComposition.CARNIVOROUS_FEEDING,
                "red",
                4);

        AnimalComposition dog = new AnimalComposition(
                AnimalComposition.DOG_SPECIE,
                AnimalComposition.OMNIVOROUS_FEEDING,
                "Black",
                10);

        List<AnimalComposition> animals = new LinkedList<>();

        animals.add(cat);
        animals.add(dog);
    }

    private List<AnimalComposition> getCats(List<AnimalComposition> animals) {
        List<AnimalComposition> cats = new LinkedList<>();
        for(AnimalComposition animal: animals) {
            if(animal.getSpecie().equals(AnimalComposition.CAT_SPECIE)){
                cats.add(animal);
            }
        }
        return cats;
    }
}
