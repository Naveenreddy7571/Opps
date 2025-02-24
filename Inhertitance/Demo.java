package Inhertitance;


/*
 *  Inheritance: inheritance is a feature in oops which is used to inherit the instance variables and methods of the parent class 
 * 
 * implemented by using extends keyword
 * used mostly for code resuability next version no need to implement the previous version of the code every where it is useful
 * 
 * Types of inheitance
 * 1.single level
 * 2.multilevel inheritance
 * 3.multiple inheritance
 * 4.hirearchcal inheritance
 * 5.hybrid inheritance
 * 
 * java doesnot support multiple inheritance through classes but can be using interface
 */

class vechile{

    public void acclerate()
    {
        System.out.println("acclerating.......");
    }

    public void turnLeft()
    {
        System.out.println("Truning Left.....");
    }

    public void turnRight()
    {
        System.out.println("Truning Right......");
    }
}


class BMW extends vechile
{
    public void music()
    {
        System.out.println("music is on...");
    }

    public void ac()
    {
        System.out.println("Ac is on............");
    }
}
public class Demo {
    public static void main(String[] args) {
        // vechile bmw = new BMW(); //only the methods in the parent class will come here becuase type is checks mailnly in inheritance

        BMW bmw = new BMW();
        
    

    }
}
