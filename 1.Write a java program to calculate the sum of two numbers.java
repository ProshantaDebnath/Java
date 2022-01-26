import java.util.Scanner;

public class AddTwoNumber {
    int a,b;
    Scanner input = new Scanner(System.in);
    void input(){
        System.out.print("The first number:");
        a=input.nextInt();
        System.out.print("The second number:");
        b=input.nextInt();
    }
    void Result(){
        int c = a+b;
        System.out.println("Addition of (" + a + "+" + b + ")=" +c);
    }
}

class Main{
    public static void main(String args[]){
        AddTwoNumber obj = new AddTwoNumber();
        obj.input();
        obj.Result();
    }
}
