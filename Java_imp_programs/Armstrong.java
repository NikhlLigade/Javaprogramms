//import java.util.*;
class Armstrong
{
    public static void main(String[] args)
    {
        int no=153;
        int t1=no;
        int length=0;
        while(t1!=0)
        {
            t1=t1/10;
            length=length+1;
        }

        int t2=no;
        int arm=0;
        int rem=0;
        while(t2!=0)
        {
            rem=t2%10;
            int mul=1;
            for(int i=1;i<=length;i++)
            {
                mul=mul*rem;
            }
            t2=t2/10;
            arm=arm+mul;
        }
        if(arm==no)
        {
            System.out.println("No is Armstrong");
        }
        else
        {
            System.out.println("No is Not armstrong");
        }
    }
}