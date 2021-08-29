public class MethodOverloading {
    void sum (int a, int b)
    {
        System.out.println("Sum is: "+(a+b)) ;
    }
    void sum (int a, int b, int c)  //different parameter
    {
        System.out.println("Sum is: "+(a+b+c));
    }

   public static void main (String[] args)
    {
        MethodOverloading  cal = new MethodOverloading();
        cal.sum (10,5);
        cal.sum (10, 20, 30);
    }
}
