class MyException extends Exception {

    public MyException(String s)
    {
        super(s);
    }
}
public class ExceptionHandlingByThrowOurOwnException {
    public static void main(String args[])
    {
        try
        {
            throw new MyException("Throwing user define exception.");
        }
        catch (MyException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
