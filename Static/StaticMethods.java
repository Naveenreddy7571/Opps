package Static;

/*
 *                 NOTES
 * 
 * we can call a static method using class name
 * 
 * static methods can acess only static variables and methods not instance variables because common sense they are all present in the class area that is the reason if you want to call instantance variable then you need to create a object in the static method
 * 
 * Non static methods can access both static and non static methods and variables
 * 
 * but static methods only static methods and variables
 * 
 * 
 * why static methods?
 * if we want to acess only static data of a class 
 * 2.if in a class there are methods that only works by their parameters then make method as static
 * 
 * Example 
 * 
 * class Math{
 * 
 *        public static int add(int a,int b)
 *         {
 *              return a+b;
 *          }
 * }
 * add methos does not acess any instance variables only their own variables so we make them static
 * 
 * 
 * IMPORTANT
 * 
 * if all the methods in in a class are static then it is called utility class
 * 
 * methods are called utlity methods
 * 
 * example collections class
 */

 class Employee{
    public String name;
    public static String company;

    public void showDetails()
    {
        System.out.println(name);
    }
    public void getComapny()
    {
        System.out.println(company);
        getComapnyy(); //non static methods can access
    }

    public static void getComapnyy()
    {
        System.out.println(company);
        // getComapnyy(); // static methods cannot call non static methods gets error
    }

 }
public class StaticMethods {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="naveen";
        
        Employee.company="Amazon";
        e.getComapny();
    }
}
