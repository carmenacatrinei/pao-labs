package com.company.constructors;

class Base2 {
    int x;

    Base2(){
        System.out.println("Base2 with no params");
    }

    Base2(int x)
    {
        System.out.println("Base2 with params");
        this.x = x;
    }
}

class Derived2 extends Base2
{
    int y, z;

    Derived2(){
        System.out.println("Derived2 with no params");
        display();
    }

    Derived2(int x, int y){
        super(x);
        System.out.println("Derived2 with params");
        this.y = y;
    }

    Derived2(int x, int y, int z)
    {
        this(x, y); //constructor chaining
        System.out.println("Dervied2 with 3 params");
        this.z = z;
        //this cu () si cu . sunt lucruri diferite
    }

    void display()
    {
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
    //prima linie e dedicata pentru super SAU this; nu poti avea si super(x) si thix(x,y,x);
}

public class PlayWithConstructor2 {
    public static void main(String[] args)
    {
        //anonymous obj
        new Derived2();

        Derived2 d = new Derived2(10, 20);
        d.display();

        new Derived2(10, 20, 30).display();

    }
}
