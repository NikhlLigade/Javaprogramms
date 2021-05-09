import java.util.*;
class Multiplicationchart
{
    public static void main(String[] args) {
        
   
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Any Number");
    int a=s.nextInt();
    for(int i=1;i<=10;i++)
    {
        System.out.println(+a+" x " +i+ " = "+(i*a));
    }
}

}