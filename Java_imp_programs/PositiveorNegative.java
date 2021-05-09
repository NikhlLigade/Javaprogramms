import java.util.*;
class PositiveorNegative
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        int n=s.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if(n<0)
        {
            System.out.println("Number Is Negative");
        }
        else
        {
            System.out.println("Number Is Not Positive Or Not Negative");
        }
    }

}