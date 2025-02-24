package Static;

/*
 *              STATIC BLOCK
 * 
 * if you want any piece of code that needs to be exceuted before the objects are created then you mention that code in static block
 * 
 * account we need to define the roi only once so we will place that code in static block
 * 
 * if any static method called first time if we use class first time then also static block is called;
 * 
 * first static block
 * next static methods
 * 
 * there can be multiple static blocks all blocks will run
 * 
 * 
 */
class Account{
    public int acid;
    public int balance;
    public static int roi;



    static{
        System.out.println("Static block 1");
        roi=10;
    }
    static{
        System.out.println("Static block 2");
        roi=10;
    }
    static{
        System.out.println("Static block 3");
        roi=10;
    }

    static{

    }

    public static void show()
    {
        System.out.println("Static method");
    }

    public Account(int acid,int balance)
    {
        System.out.println("Constructor");
        this.acid=acid;
        this.balance=balance;
    }

    public void getDetails()
    {
        System.out.println(this.acid+" "+this.balance+" " +roi);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Account.show();
        Account a1 = new Account(100, 1000);
        Account a2 = new Account(101, 1000);  
        Account a3 = new Account(102, 1000);
        a1.getDetails();
    }

    

}
