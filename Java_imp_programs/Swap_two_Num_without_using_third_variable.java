import java.util.*;
class Swap_two_Num_without_using_third_variable
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number  Of  First Variable");
        int a=s.nextInt();
        System.out.println("Enter The Number  Of  Second Variable");
        int b=s.nextInt();
                      // Consider the value of A=10 and B=20
        a=a+b;      // First Condition  a=a+b  i.e a=10+20  a=30
        b=a-b;      //Second Condition  b=a-b  i.e b=30-20  b=10
        a=a-b;      //Third Condition   a=a-b  i.e a=30-10  a=20

        System.out.println("After Swapping the Change the variable value");
        System.out.println("value of A ="+a);
        System.out.println("value of B ="+b);

        


    }
}