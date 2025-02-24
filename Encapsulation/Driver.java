/*
real world examples are 
    i have a acoount in a bank and if people have acess to my account number
    they cannot get all the details of me like
    ->balance 
    ->transcations
    ->all the details
    this information is not visible outside the world and you can acess the information
    with the bank methods
*/
class Student{
    private int rollno;
    private String name;
    private int percentage;

    public Student(int rollno,String name,int percentage)
    {
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }


    
}


public class Driver{
    public static void main(String[] args) {
        Student stu = new Student(1,"naveen",98);
        System.out.println(stu.getRollno());
        System.out.println(stu.getName());
        stu.setName("naveen reddy");
        System.out.println(stu.getName());
    }
}