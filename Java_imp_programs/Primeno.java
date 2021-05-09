import java.util.*;

class Primeno
{
    public static void main(String[] args)
    {
 
            int temp=0;
            int no;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Any Number");
                no=sc.nextInt();
               for(int i=2;i<=no-1;i++)
               {
                   if(no%i==0)
                   {
                       temp=temp+1;
                   }
               }
               if(temp==0)
               {
                   System.out.println("No is  prime");
               }
               else{
                   System.out.println("No is Not Prime");
               }
            

    }
}

