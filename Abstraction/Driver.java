package Abstraction;

/*
 * 
 * 
 * 
 * abstracts all the underling complexity and shows only necessary functionalites like car example to drivve the car i need not to know everthing about car so only the functionalites
 * 
 * 
 * Another example is atm dispacher where i dont know inside how an atm works what i know is to put the card and withdraw the money 
 * hiding all the complications is the example of Abstraction
 */
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
        car carr = new car();
        carr.turnOnCar();
        carr.acclerate();
    }
}
