package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1
        /*System.out.println("Introduceti valoarea lui n: ");

        int n = scanner.nextInt();

        for(int index = 0; index <= n; index++)
        {
            System.out.print(index + " ");
        }*/

        //2
        /*System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        if(a > b)
        {
            System.out.println(a);
        }
        else if(b > a)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println("Numerele citite sunt egale!");
        }*/

        //3
        /*System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));*/

        //4
        /*System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(multipleSum(n));*/

        //5
        /*ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        System.out.print("n = ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i ++) {
            int x = scanner.nextInt();

            if (x % 2 == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }
        System.out.println("Pare: " + even);
        System.out.println("Impare: " + odd);*/

        //6
        /*System.out.print("n = ");
        int n = scanner.nextInt();

        int nota;
        int nrNoteIntroduse = 0;

        float media = 0;
        for (int i = 1; i <= n;i++) {
            nota = scanner.nextInt();
            if (nota == -1) {
                break;
            }
            nrNoteIntroduse++;
            media = media + nota;
        }

        System.out.println("Media: " + media/nrNoteIntroduse);
        scanner.close();*/

        //7
        System.out.print("n = ");
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        int next = 0;
        for(int i = 1; i < n; i++)
        {
            next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println(next);

    }

    //3
    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    //4
    public static int multipleSum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

}
