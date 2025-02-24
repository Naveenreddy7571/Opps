package Inhertitance;
/*
 *  Super keyword is a special type of keyword that is used to refere to the parent class that it extends
 * 
 * uses
 * 
 * 1.for calling parent constructor
 * 2.used in method overriding when we want the method of only of parent class
 */

 class A{
    A()
    {
        System.out.println("In class A");
    }

    A(String name)
    {
        System.out.println(name);
    }
 }

 class B extends A{
    B()
    {
        //by default compiler places the super key word to call the parent class constructor
        //A() we can use to call our own constructor in parent class
        super("naveen");
        // this("naveen");  // Constructor call must be the first statement in a constructor cannot use both at a time
        System.out.println("In class B");
    }

    B(String name)
    {
        System.out.println(name);
    }
 }
public class Super {
    public static void main(String[] args) {
        B b = new B();

    }
}
