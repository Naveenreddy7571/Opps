package Abstraction;

/*
 * 
 * Defination see in book
 * 
 * important points 
 * 1.But every data declared in an interface is automatically "public","static"."final"
 * 2.Interface can also contain methods but every method as "public","abstract"
 * 
 * 3. From java 8 interfaces can also contain default static methods
 * 4.If a interface contains only one method then it is called fuctional interface
 */

 interface A {
    static void fun() {
        System.out.println("Hello");
    }
}

public class MyClassInterface implements A {
    public static void main(String[] args) {
        // Correct way to call static method from an interface
        A.fun();
    }
}

