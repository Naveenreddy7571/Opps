package Final;


/*
 *      What is "final" keyword in java

    final is a non access modifier in java and can be used in three ways
 * 
    variable => to not change the variable again like constant
    method => to stop override
    class => to stop inheritance
 * 
 */

 class A{
    public final int a =10;

    public final void show()
    {
        // a=20; //The final field A.a cannot be assigned
        System.out.println(
            "in class A"
        );
    }

 }

 final class B extends A{
    // public final void show()
    // {
    //     // error Cannot override the final method from A
    // }
 }

//  class c extends B{
//     //The type c cannot subclass the final class B
//  }


public class Demo {
    
}
