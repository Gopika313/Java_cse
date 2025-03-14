class parent{
    void display(){
        System.out.println("hello");
    }
}
class Child extends parent{
    void display(){
        System.out.println("home");
    }
}
public class Ove{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }
}