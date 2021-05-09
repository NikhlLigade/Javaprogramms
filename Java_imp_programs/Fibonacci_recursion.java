class Fibonacci_recursion
{
    static int a=0,b=1,c;
    public static void main(String[] args) {
        Fibonacci_recursion fr=new Fibonacci_recursion();
        fr.fibo(10);
    }

    void fibo(int i)
    {
        if(i>=1)
        {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        fibo(i-1);
        }
    }
}