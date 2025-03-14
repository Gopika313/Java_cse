public class Div{

    public int divide(int numOne,int numTwo){
        int numThree=numOne/numTwo;
        return numThree;
    }
        
    public static void main(String args[])
    {
    Div obj=new Div();
    int c=obj.divide(10,2);
    System.out.println(c);
    }
}