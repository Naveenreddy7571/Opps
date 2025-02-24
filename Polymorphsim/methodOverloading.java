package Polymorphsim;

/*
    Defination : methodoverloading is crearing the multiple versions of the same entity is called method overloading 
 * 
 *                  Advantages are 
 * 1. reduces the complexity of the code of creating diffrent methods for same task
 * 2.increases the redability of the program
 * 
 * 
 * 
 *              ******Important******
 *          by changing the postion of the arguments we can overload a method
 *          but the aruguments should be of diffrent types
 */        
class calculator{

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }

    
    public void add(double a,double b)
    {
        System.out.println(a+b);
    }
    public void  show(int age,String name)
    {
        System.out.println(age+name);
    }

    public void show(String name,int age)
    {
        System.out.println(name+" "+age);
    }

    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    // public int add(int a,int b)  //Duplicate method add(int, int) in type 
    // {
    //cannot overload a method by changing its return type
    //     return a+b;
    // }
    
}
public class methodOverloading {
    
}
