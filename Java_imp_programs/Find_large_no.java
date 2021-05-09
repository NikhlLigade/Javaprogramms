import java.util.*;
class Find_large_no
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=s.nextInt();
        System.out.println("Enter Second Number");
        int b=s.nextInt();
        System.out.println("Enter Third Number");
        int c=s.nextInt();

        /*

        //This program is a find grater number of the two number
        if(a>b)
        {
            System.out.println("A is grater Than B");
        }
        else
        {
            System.out.println("B is grater Than A");
        }

        */
        if(a>b && a>c)
        {
            System.out.println("A is grater");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is grater");
        }
        else
        {
            System.out.println("C is grater");
        }
    }
}