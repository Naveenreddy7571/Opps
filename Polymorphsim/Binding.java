package Polymorphsim;

/*
 *  Binding in java
 * 
 * Binding: The mechanisim that is used by java compiler to descide upon calling a function which function body should exceute.
 * 
 * Mainly useful in polymorphism
 * 
 * Two types of binding
 * 1.Early binding => compile time binding
 * 2.Late binging => Run time binding
 * 
 * Early binding:
 * 
 * if i call a static method then java compiler see the class name not the object to call the method 
 * 
 * Example: 
 * 
 * class A{
    public static void show()
    {
        System.out.println("In class A");
    }
 }

 class B extends A{
    public static void show()
    {
        System.out.println("In class B");
    }
 }
public class Binding{
    public static void main(String[] args) {
        A b = new B(); //Late biding or runtime binding
        b.show();
    }
}
 * 
 * 
 * Late Binding
 * 
 * sees the object type for non static methods
 * 
 * 
 class A{
    public  void show()
    {
        System.out.println("In class A");
    }
 }

 class B extends A{
    public  void show()
    {
        System.out.println("In class B");
    }
 }
public class Binding{
    public static void main(String[] args) {
        A b = new B(); //Late biding or runtime binding
        b.show();
    }
}
 * 
 */

 class A{
    public  void show()
    {
        System.out.println("In class A");
    }
 }

 class B extends A{
    public  void show()
    {
        System.out.println("In class B");
    }
 }
public class Binding{
    public static void main(String[] args) {
        A b = new B(); //Late biding or runtime binding
        b.show();
    }
}