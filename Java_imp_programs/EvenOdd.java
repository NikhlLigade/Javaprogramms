import java.util.*;
class EvenOdd
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number Is Odd");
        }
        
    }
}