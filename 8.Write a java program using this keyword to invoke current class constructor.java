public class AddTwoNumber {
    int a;
    int b;
    int c;
    AddTwoNumber(){
        System.out.println("Doing addition of two number.");
    }
    AddTwoNumber(int a, int b){
        this();
        this.a=a;
        this.b=b;
    }
    int sumOfTwo(){
        c= a+b;
        return c;
    }
    void display(){
        System.out.println("Sum="+c);
    }
    public static void main(String args[]){
        AddTwoNumber sum = new AddTwoNumber(10,20);
        sum.sumOfTwo();
        sum.display();
    }

}
