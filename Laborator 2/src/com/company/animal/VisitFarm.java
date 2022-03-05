package com.company.animal;

public class VisitFarm {
    public static void main(String[] args){
        Animal animal = new Animal("Max", "ham");
        Bird bird = new Bird("chip-chip");

        System.out.println(animal.noOfLegs);
        System.out.println(bird.noOfLegs);
        System.out.println(animal.getNoOfLegs());
        System.out.println(bird.getNoOfLegs());

        Animal animal1 = new Animal("Max", "ham-ham");
        Animal animal2 = new Animal("Max", "ham");
        Animal animal3 = animal1;

        //Object - class parent for all classes
        //in Object there are implementations for: equals (==), hashCode, toString
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal3)); //equals verifica field urile
        System.out.println(animal1 == animal3); //zona de memorie

        System.out.println(animal1); //to string neimplementat afiseaza com.company.animal.Animal@710c0954
        //cu tostring implementat afiseaza Animal{noOfLegs=4, sound='ham-ham', name='Max', age=0}
    }
}
