import java.util.*;
public class Inpt{
    public void add(int a,int b)
    {
        int c = a+ b;
      System.out.println("sum:"+c);
      }
        public void multiply(int a,int b)
        {
            int c = a * b;
            System.out.println("product:"+c);
        }
        public void subtract(int a,int b){
            int c = a - b;
             System.out.println("difference:"+c);
        }
        public void divide(int a,int b)
        {
           int c = a / b;
            System.out.println("divendend:"+c);
        }
      

        public static void main(String args[])
        {
            Scanner input=new Scanner(System.in) ;
            System.out.println("enter the value of a");
            int a = input.nextInt() ;
            System.out.println("enter the value of b");
            int b = input.nextInt() ;
            System.out.println("enter your choice");
            int choice = input.nextInt() ;
            if(choice == 1){
            Inpt obj = new Inpt();
            obj.add(a,b);}
            if(choice == 2){
            Inpt obj = new Inpt();
            obj.multiply(a,b);}
           if(choice == 3){
            Inpt obj = new Inpt();
            obj.subtract(a,b);}
           if(choice == 4){
            Inpt obj = new Inpt();
            obj.divide(a,b);}
           

            {

            }
        }
}