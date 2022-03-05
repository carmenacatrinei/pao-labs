package com.company.animal;

import java.util.Objects;

public class Animal {
    int noOfLegs = 4;

    private String sound;

    private String name;

    private int age;

    public Animal(){}

    public Animal(int noOfLegs)
    {
        this.noOfLegs = noOfLegs;
    }
    //supraincarcare - overloading constructor
    public Animal(String name, String sound){
        this(sound);
        this.name = name;
    }

    public Animal(String sound)
    {
        this.sound = sound;
    }

    //no return value - void
    //overloading - supraincarcare a metodei printName()
    public void printName(String name ){
        System.out.println("I wish my animal's name was "+ name + " but is: " + this.name);
    }

    public void printName(){
        System.out.println("I wish my animal's name was "+ name + " but is: " + this.name);
    }

    public void move()
    {
        System.out.println("I can move!");
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound()
    {
        return sound;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    @Override
    public boolean equals(Object o) { //o1 si o2 sunt egale => bucket cu hashCode ul egal, pe baza lui poti gasi mai usor un element
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o; //cast
        return getNoOfLegs() == animal.getNoOfLegs() && age == animal.age && getSound().equals(animal.getSound()) && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoOfLegs(), getSound(), name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noOfLegs=" + noOfLegs +
                ", sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
