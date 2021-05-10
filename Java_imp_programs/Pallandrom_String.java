class Pallandrom_String
{
    public static void main(String[] args) 
    {
        String name="aba";
        String temp=name;

        int lanth=temp.length();
        String reverse="";

        for(int i=lanth-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }
       // System.out.println("Reverse String is = "+reverse);
        if(temp.equals(reverse))
        {
            System.out.println(" String is Pallandrom = "+reverse);
        }
        else
        {
            System.out.println(" String is not Pallandrom = "+reverse);
        }
    }
}