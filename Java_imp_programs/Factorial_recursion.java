class Factorial_recursion
{
    int fact=1;
    public static void main(String[] args)
    {
        int no=5,res;
        Factorial_recursion fr=new Factorial_recursion();
       res= fr.factcal(no);
       System.out.println(res);
    }

    int factcal(int no)
    {
            if(no>1)
            {
                fact=fact*no;
                factcal(no-1);
               
            }
            return fact;
    }
}