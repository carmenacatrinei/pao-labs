package com.company.animal;

public class Bird extends Animal{
    int noOfLegs = 2;

    public Bird(String sound){
        super(sound);
    }

    //suprascriere = overriding
    @Override
    public void printName(){
        System.out.println("Birds have no name");
    }

    public int getNoOfLegsFromParent(){
        return super.getNoOfLegs();
    }
}
