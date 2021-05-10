import java.util.*;
class Alphabet_or_not
{
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Character");
        char ch =s.next().charAt(0);

        if((ch >='A' && ch <= 'z')|| (ch>='a' && ch<='z'))
        {
            System.out.println("Given Character is Alahabet");
        }
        else
        {
            System.out.println("Given Character is not Alahabet");

        }
    }
}