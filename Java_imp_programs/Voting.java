import java.util.*;
class Voting
{
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    String name;
    System.out.println("Enter Person Name");
    name=s.next();
    int age;
    System.out.println("Enter Person Age");
    age=s.nextInt();
    System.out.println ("Person Name is="+name);
    System.out.println("Person Age is="+age);
    if(age>18)
    {
        System.out.println("This Person is eligibale for voting");
    }
    else
    {
        System.out.println("This Person is not eligibale for voting");
    }
    } 
}