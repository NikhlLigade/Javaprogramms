import java.util.*;
class Swap
{
    public static void main(String[] args)
     {
        int a,b,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Value Of A");
        a=s.nextInt();
        System.out.println("Enter Value Of B");
        b=s.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swappning Output is");
        System.out.println("A="+a);
        System.out.println("B="+b);

    }
}