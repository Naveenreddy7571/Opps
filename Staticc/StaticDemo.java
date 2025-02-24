package Staticc;
/* 
 * static is a special type of non acess sepecifier which can be used before a variable and methods and classes 
 * 
 * a instance variable only can be static not local variables
 * 
 * it is used mainly used for common properties among objects to reduce the memory 
 * 
 * static variables can be accesed  by objects also but accessing by class Name is good approach
 * 
 * static variables are created in method area or premenant generation area
 * 
 * a variable present in a class are called instance variables
 * a variable present in a method are called local variables
 * 
 * a static variable or method present in a class are closely associated with class
 * a instance variable or method present in a class closely associated with objects
 */

 class Demo {
    int a;
    static int b;




    public Demo(int a) {
        this.a = a;
        System.out.println("constructor");
    }
}

 public class StaticDemo{
    public static void main(String[] args) {

        Demo obj1 = new Demo(10);
        Demo obj2 = new Demo(20);
        Demo obj3 = new Demo(30);
        System.out.println("a: " + obj1.a);
        System.out.println("b: " + Demo.b);
        obj1.b=20; //we can acess by object but better approach is by className because they are created for classes not for objects compiler converts to Demo.b
        obj2.b=30;
        obj3.b=40;
        System.out.println(obj1.b+" "+obj2.b+" "+obj3.b);

    }
 }