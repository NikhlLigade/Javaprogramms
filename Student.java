import java.util.*;
class Demo
{   
    String name;
    int id;
    int mobileno;
    Scanner s=new Scanner(System.in);
    
   void studinfo()
   {
    System.out.println("Enter values");   
    name=s.next();
    id=s.nextInt();
    mobileno=s.nextInt();

   }
   void display()
   {
       System.out.println(name);
       System.out.println(id);
       System.out.println(mobileno);
       
   }

}
class Student
{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.studinfo();
        d.display();
     
      
    }
}
