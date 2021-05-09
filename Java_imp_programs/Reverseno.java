import java.util.*;
class Reverseno
{
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Any Number");
    int no=s.nextInt();
    int reminder=0;
    int reverse=0;

    while(no!=0)
    {
        reminder=no%10;  
        reverse=reverse*10+reminder;
        no=no/10;
    }
    System.out.println("Reverse no is="+reverse);
}

}