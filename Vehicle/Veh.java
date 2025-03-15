import java.util.*;
public class Veh{
    public static void main(String args[]){
          while(true){
             Scanner sc= new Scanner(System.in);
        System.out.println("\n1.car\n2.truck");
        int truck = sc.nextInt();

        System.out.println("Enter the choice:");
        System.out.println("\n1.is RFID:");
        System.out.println("\n2.is not RFID:");
        int RFID = sc.nextInt();

        
        
        if(truck==1)
        {
            if(RFID==1){
double percent1=100*0.1;
            double tollfee1=100-percent1;
            System.out.println("the.tollfee.is:"+tollfee1);
        
            }
            else{
                System.out.println("100");
            }
            
            
        }
        else if(truck==2)
        {
             if(RFID==1){
            double percent2=200*0.1;
            double tollfee2=200-percent2;
            System.out.println("the.tollfee.is:"+ tollfee2);
        }
        else{
            System.out.println("200");
        }

        }
          }
}
}