package Arguments;
import java.util.*;

/*
 * 
 *      IMPORTANT 
 *      
 * IN JAVA THERE IS ONLY PASS BY VALUE THERE IS NO PASS BY REFERENCE BITTER TRUTH
 * 
 * EVEN FOR THE OBJECTS ALSO IT CREATE A COPY OF THE REFERENCE WHICH IS PASS BY VALUE 
 * 
 * THE MAIN REASON BEHIND THIS IS IN JAVA THERE IS NO POINTERS THAT IS THE REASON
 * 
 */
public class Hello {
    public static void swap(Integer a,Integer b) //formal arguments 
    {
         a = a+b;
         b=a-b;
         a=a-b;
    }
    public static void change(List<Integer> arr)
    { //create a copy we can change the copy to anything
        arr=new ArrayList<>(Arrays.asList(5,6,7,8));

    }
    public static void main(String[] args) {
        Integer a=5;
        Integer b=20;
        System.out.println("Before swap "+a+","+b);
        swap(a,b); //actual arguments
        System.out.println("After swap "+a+","+b);

        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println("Before"+arr.toString());
        change(arr);
        System.out.println("After"+ arr.toString());
    }
}
