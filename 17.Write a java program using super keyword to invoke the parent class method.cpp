class AreaOfRectangle{
    void Result(){
        int a=100,b=200;
        System.out.println("Area of Rectangle is : "+ (a*b));
    }
}

class SubTwoNumber extends AreaOfRectangle{
    void Result(){
        super.Result();//invoke parent method
        int a=2000,b=234;
        System.out.println("Subtraction of two number is : " + (a-b));
    }
}

public class InvokeParentClassMethod {
    public static void main(String args[]){
        SubTwoNumber obj = new SubTwoNumber();
        obj.Result();
    }

}
