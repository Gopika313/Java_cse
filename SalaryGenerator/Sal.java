import java.util.*;
public class Sal{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n1.developer\n2.manager");
        System.out.println("Enter the choice:");
        int i = sc.nextInt();
        System.out.println("Enter the salary:");
        int salary = sc.nextInt();
        if(i==1)
        {
            double percent1=salary*0.1;
            double salary1=salary+percent1;
            System.out.println("the.salary.is:"+salary1);
        }
        else if(i==2)
        {
            double percent2=salary*0.2;
            double salary2=salary+percent2;
            System.out.println("the.salary.is:"+salary2);
        }
    }
}