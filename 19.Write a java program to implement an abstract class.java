abstract class Class1 {
    abstract void method2();
    void method1(){
        System.out.println("Factorial of 5 is:");
        int f=1,i;
        for(i=1;i<=5;i++){
            f=f*i;
        }
        System.out.println(f);
      }
    }
class Class2 extends Class1{
   void method2(){
       int a=11,b=234;
       System.out.println("Addtion of two number is : " + (a+b));
   }
}

public class AbstrackMethod {
    public static void main(String args[]){
        Class2 obj =new Class2();
        obj.method1();
        obj.method2();
    }
}
