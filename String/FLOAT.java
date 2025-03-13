public class FLOAT{

    public int multiply(int numOne,int numTwo){
        int numThree=numOne*numTwo;
        return numThree;
    }
        
    public static void main(String args[])
    {
    FLOAT obj=new FLOAT();
    int c=obj.multiply(10,20);
    System.out.println(c);
    }
}