package com.company.constructors;

class Base {
    Base() {
        System.out.println("Base constructor called!");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor called!");
    }
}

public class PlayWithConstructor1 {
    //default constructor inserted by the compiler only if there is no other constructor already defined
    public static void main(String[] args) {
	Derived d = new Derived(); //intai parintele, dupa clasa derivata
        PlayWithConstructor1 p = new PlayWithConstructor1();
    }
}
