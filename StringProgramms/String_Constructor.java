class StringConstructor
{
    public static void main(String[] args) {
        String s=new String();//Empty String
        String s1=new String("JavaProgramming");//
        System.out.println(s.length());
        System.out.println(s1.length());//Print the length of string

        StringBuffer sb=new StringBuffer("JavaProgramming");
        String s2=new String(sb);
        System.out.println(s2);

        StringBuilder sb1=new StringBuilder("JavaProgramming");
        String s3=new String(sb1);
        System.out.println(s3);

        byte[] b={101,102,103};
        String s4=new String(b);
        System.out.println(s4);

        char[] c={'j','a','v','a'};
        String s5=new String(c);
        System.out.println(s5);


        char[] c1=new char[]{'j','a','v','a'};

        String s6=new String("Java");
        System.out.println("c1 = "+c1); // char array not provide original value of the object // it is used to create password
        System.out.println("s6 = "+s6); // String object is provide original value inside the object 
    }
}