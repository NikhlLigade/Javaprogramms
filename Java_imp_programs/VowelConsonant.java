import java .util.*;
class VowelConsonant
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Character !");
               
        char ch=s.next().charAt(0);

        if((ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') || (ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'))
        {
            System.out.println("Given Character is Vowel");
        }
        else
        {
            System.out.println("Given Character is Consonant");
        }
    }
}