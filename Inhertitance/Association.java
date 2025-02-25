package Inhertitance;

/*
 * 
 * 1.Inheritance IS-A relation
 * 2.Association (HAS-A)
 * 
 * If a class contains a Another class object then that relation is called Association relation ship
 * 
 * car has a engine
 * collage has a student 
 */

 class A{
    public B b;
    A(B b)
    {
        this.b=b;
    }
 }

 class B{
    int a=10;
    public void show()
    {
        System.out.println("Hello");
    }
 }
public class Association {
    public static void main(String[] args) {
        B obj = new B();
        A obj1 = new A(obj);

        obj1.b.show();
    }
}
