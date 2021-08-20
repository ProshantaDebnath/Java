public class PassArgumentMethod {
    void method1(PassArgumentMethod obj){
        System.out.println("Method is invoked.");
        System.out.println("Addition of two number");
        int a,b;
        a=10;
        b=30;
        int c=a+b;
        System.out.println("Result:"+c);
    }
    void method2(){
        method1(this);
    }
    public static void main(String args[]){
        PassArgumentMethod obj=new PassArgumentMethod();
        obj.method2();
    }
}
