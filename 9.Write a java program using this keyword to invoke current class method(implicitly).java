public class InvokeCureentClass {
    void method1(){
        System.out.println("Method_1 is invoked.");
        System.out.println("Factorial of 5 is:");
        int f=1,i;
        for(i=1;i<=5;i++){
            f=f*i;
        }
        System.out.println("Result is:"+f);
    }
    void method2(){
        method1();
    }
    public static void main(String args[]){
        InvokeCureentClass obj = new InvokeCureentClass();
        obj.method2();
    }
}
