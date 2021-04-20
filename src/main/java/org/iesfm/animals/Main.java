package org.iesfm.animals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cat> cats =  new ArrayList<>();
        cats.add(new Cat("red", 1, 7));
        cats.add(new Cat("red", 5, 4));

        for(Cat cat: cats) {
            cat.walk();
            cat.kill();
            cat.saySomething();
        }

        List<Pig> pigs = new ArrayList<>();
        pigs.add(new Pig("pink", 5, 100));
        pigs.add(new Pig("pink", 10, 120));

        for(Pig pig: pigs) {
            pig.walk();
            // pig.kill(); no compila
            pig.saySomething();
        }

        List<Animal> animals = new ArrayList<>();
        animals.addAll(cats);
        animals.addAll(pigs);
        animals.add(new Dog("black", 4, "chiguagua"));
        animals.add(new Dog("white", 5, "bulldog"));
        System.out.println("ANIMALES");
        for(Animal animal: animals) {
            animal.walk();
            // animal.kill(); no compila porque Animal no tiene el método kill
            animal.saySomething();
        }


        List<Dog> dogs = filterDogs(animals);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for(Dog dog:dogs) {
            dog.saySomething();
        }
        // Animal animal = new Animal("blue", 3); No compila porque Animal es abstracto


    }

    public static List<Dog> filterDogs(List<Animal> animals) {
        List<Dog> dogs = new LinkedList<>();
        for(Animal animal: animals) {
            // animal ??? es un perro?
            if(animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dogs.add(dog);
            }
        }

        return dogs;
    }
}
