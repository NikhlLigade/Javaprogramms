class Pallandromno
{
    public static void main(String[] args) {
        
        int no=121;
        int temp=no;
        int res=0;
        int rem=0;
        


        while(no!=0)
        {
            rem=no%10;
            res=res*10+rem;
            no=no/10;
        }
        
        if(temp==res)
        {
            System.out.println("No is Pallandrom = "+res);
        }
        else
        {
            System.out.println("No is not Pallandrom = "+res);
        }
     }
}