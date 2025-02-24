import java.util.Arrays;
import java.util.List;

//constructor cannot be private we are calling right so it needs to be visible

/*
 *              Types of constructor
 *  
 * 1.Default Constructor which is provided by the compiler if we not mention any
 * 2.non paramatrized constructor => there is constructor whith out any arguments
 * 3.paramatrized constructor
 * 
 * 
 */
class Hello{
    public int roll;
    public int[] arr;
    public String s;
    public List<Integer> aa;
    public Hello() //non paramatrized constructor
    {
        System.out.println("Do some work other than insilizing");
    }
    
    public Hello(int roll) //paramatrized constructor
    {
        this.roll = roll;
    }
    @Override
    public String toString() {
        return "Hello [roll=" + roll + ", arr=" + Arrays.toString(arr) + ", s=" + s + ", aa=" + aa + "]";
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Hello hello = new Hello(200);
        System.out.println(hello.toString());
    }
}
