import java.util.*;
class Factorial
{
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number");
        int no=s.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {   
            fact = fact*i;

        }
        System.out.println("fACTORIAL NO  "+no+" is "+fact);
    }
} 