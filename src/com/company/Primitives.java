package com.company;

public class Primitives {

    //No floating point - can be written in base 10/binary/hexadecimal

    //8 bit : [-128..127]
    byte b1 = 10;
    byte b2 = 023; //octal

    //16 bit
    short s1=10;
    short s2 = 0xFF; //hexa

    //32 bit; 4 bytes
    int i1 = 10;
    int i2 = 0b10110; //binary

    //64 bit; 8 bytes
    long l1 = 10;

    /*Floating point - can only be in decimal form */
    //32 bit floating point - by default in java every fractional value is considered to be a double
    //and that's why we use a literal (f, F) for float

    float f1 = 123.45f;

    //64 bit floating point; by default in java every fractional value is considered to be a double

    double d1 = 123.456;

    //16 bit
    char c1 = 'a';
    char c2 = '\n';

    boolean k1 = false;
    boolean k2 = true;

    /*Numeric literals can have underscores inside them for separating groups. However, a numeric literal cannot start
    * or end with an underscore (eg. _52 is an invalid number)*/
    int underscoreInt = 1____234; //it represents the number 1234
}

/* Default values:
* byte/short/int - 0
* long - 0L
* boolean - false
* char - '\u0000'
* float - 0.0f
* double - 0.0 */

/*Instructions:
* 1. Decision making:
*       if/else
*       Switch (case)
* 2. Loops
*       for/ for each
*       While / do-while
* 3. Jump
*       Break
*       Continue  */

/* Arrays
* from 0 to n-1
* length
* java.util.Arrays - methods for working with arrays (like Sort, Equals, binarySearch etc.) */

/*
*
*
*
*
*
* */
