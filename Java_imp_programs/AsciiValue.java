class AsciiValue
{
    public static void main(String[] args) {
        char capitalchar='A';
        
        System.out.println("ASCII VALUE from A-Z");
        for(int i='A';i<='Z';i++)
        {
            System.out.println(capitalchar+" : "+i);
            capitalchar++;
        }

       System.out.println("-------------------");

       char smallchar='a';
        
        System.out.println("ASCII VALUE from a-z");
        for(int j='a';j<='z';j++)
        {
            System.out.println(smallchar+" : "+j);
            smallchar++;
        }
    }
}