import java.util.*;
public class Digii{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n numbers:");
        int n = input.nextInt();
        int a[] = new int[n];
        int i =0;
        int j =0;
        while(i<n){
System.out.println("Enter the value:");
a[i] = input.nextInt();
i = i+1;
        }
         j =0;
        int sum=0;

        while(j<n){
            sum=sum+a[j];
            j=j+1;
        }
        System.out.println("Addition:"+(sum));
}
}