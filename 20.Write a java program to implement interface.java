interface AreaOfRectangle {
     void method();
}
class NewClass implements AreaOfRectangle
{

    public void method()
    {
        int a=100,b=200;
        System.out.println("Area of Rectangle is : "+ (a*b));
    }
}

public class ImplementInterface{
    public static void main(String arg[])
    {
        NewClass obj = new NewClass();
        obj.method();
    }
}
