package Inhertitance;
/*
 * What is Method Overriding
* Whenever a child class contains a method with the same prototype as the parent class, then we say that the method of child class has OVERRIDDEN the method of parent class
 *          
 * 
 *  Method Overriding V/s Method Overloading
    
    Method Overloading
    Method Overriding
    → Overloading can be done either within the same or between methods of PARENT
    & CHILD class
    Overriding can never be done within a single class and it always requires INHERITANCE i.e overriding can be done between between of PARENT & CHILD only

    => Overloading says methods must have same, but COMPULSORILY different arguments
    => Overriding says methods MUST COMPULSORILY have exactly same prototype. Although overriding allows CO-VARIANT return types
 * 
 * 
 *          covarient return type: we can change the return type in method overriding only if it is a subclass of parent class method return type
 * 
 * public AA engine()
    {
        System.out.println("1200cc");
        return new AA();
    }

     @Override
    public BB engine()
    { super.engine();

        System.out.println("2000cc");
        return new BB(); //covarient return type
    }

    BB is subclass of AA so we can change the return type this is called covariance return type
 */
class AA
{
    public AA engine()
    {
        System.out.println("1200cc");
        return new AA();
    }
}

class BB extends AA{
    @Override
    public BB engine()
    { super.engine();

        System.out.println("2000cc");
        return new BB(); //covarient return type
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        BB b = new BB();
        b.engine();
    }
}
