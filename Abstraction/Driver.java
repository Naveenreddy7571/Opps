package Abstraction;

/*

 * abstracts all the underling complexity and shows only necessary functionalites like car example to drivve the car i need not to know everthing about car so only the functionalites
 * 
 * 
 * Another example is atm dispacher where i dont know inside how an atm works what i know is to put the card and withdraw the money 
 * hiding all the complications is the example of Abstraction
 * 
 * Important points
 * 
 * 1.we cannot create objects for abstract class 
 * 2.we can create constructors for abstract class but why 
 * 3.Another class should extends the abstract class so it needs constructor
 * 4.we cannot make a constructor as abstract because it needs to be used by subclass and subclass cannot implement the parent constructor
 * 5.we cannot make the private methods as abstract because private methods are not visible in the subclasses of cannot
 * 6.we cannot use acess modifiores
 */

 abstract class A{
    A(){
        System.out.println("In abstract class");
    }
    public  abstract void Hello();
 }

 class B extends A
 {

    @Override
    public void Hello() {
        System.out.println("Hello in class B");
    }
    
 }
class car
{
    private void spark()
    {
        System.out.println("plug sparked");
    }
    private void changePistonSpeed()
    {
        System.out.println("piston speed changed");
    }


    public void turnOnCar()
    {
        spark();
        System.out.println("car started");
    }
    public void acclerate()
    {
        changePistonSpeed();
        System.out.println("Increasing speed");
    }

}
public class Driver {
    public static void main(String[] args) {
        // car carr = new car();
        // carr.turnOnCar();
        // carr.acclerate();

        A obj = new B();
        obj.Hello();
    }
}
