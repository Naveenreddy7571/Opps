package Polymorphsim;
/*
 * 
 * Runtime polymorphisim:
 * Calling diffrent methods of same type by using single reference is called runtime polymorphism
 * In java runtime polymorphisim is aslo know a dynamic method dispatch
 * 
 * In order to acheive the run time polymorphisim we must able to use same reference with diffrent versions of objects 
 * 
 * Same reference means parent class Parent obj = new Child();
 * diffrent objects means child class
 * 
 * For variables it see references 
 * 
 * for Methods it uses object types
 * for static method usese reference only
 * 
 * 
 */

 class Parent{
    int a=3;
    public void show()
    {
        System.out.println("In parent A");
    }
 }

 class Child extends Parent{
    int a=10;
    public void show()
    {
        System.out.println("In child");
    }
 }
public class RuntimePolymorphisim {
    public static void main(String[] args) {
        // Parent obj = new Child();
        // obj.show();
        

        Parent obj = new Child();
        System.out.println(obj.a);
        // obj.show();
        
    }
}
