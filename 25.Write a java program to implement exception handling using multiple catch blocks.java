public class ExceptionHandlingUsingMultipleCatchBlock {
    public static void main(String args[])
    {
        int a[]={5,10};
        int b=5;
        try
        {
            int x=a[2]/b-a[1];
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException =>" + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException =>" +    
            e.getMessage());
        }
        catch(ArrayStoreException e)
        {
            System.out.println("ArrayStoreException =>" + e.getMessage());
        }
        int y=a[1]/a[0];
        System.out.println("y= "+y);
    }
}
