class String_Case_voncersion
{
    public static void main(String[] args) {
        String name="JaVa";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        System.out.println("---------------------");

        int a=10;
        int b=20;
        System.out.println(a+b);

        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println(s1+s2);

        System.out.println("---------------------");

        char[] c=name.toCharArray();
        System.out.println(c);

    }
}