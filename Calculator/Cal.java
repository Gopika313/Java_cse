public class Cal{

    public int subtract(int numOne,int numTwo){
        int numThree=numOne-numTwo;
        return numThree;
    }
        
    public static void main(String args[])
    {
    Cal obj=new Cal();
    int c=obj.subtract(30,20);
    System.out.println(c);
    }
}