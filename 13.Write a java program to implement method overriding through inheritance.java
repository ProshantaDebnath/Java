class AreaOfRectangle{
    void Result(){
        int a=100,b=200;
        System.out.println("Area of Rectangle is : "+ (a*b));
    }
}

//Method overidding
class AddTwoNumber extends AreaOfRectangle{
    void Result(){
        super.Result();
        int a=11,b=234;
        System.out.println("Addition of two number is : " + (a+b));
    }
}

public class MethodOveridding {
    public static void main(String args[]){
       AddTwoNumber obj = new AddTwoNumber();
       obj.Result();
    }
}

