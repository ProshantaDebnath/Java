import java.util.Scanner;

public class Fibonacci {
    int n;
    Scanner input = new Scanner(System.in);
    void input(){
        System.out.println("The first nth terms:");
        n=input.nextInt();
    }
    void fibonacci(){
        int a=0,b=1,c;
        int i=0;
	System.out.println("Series is :-");

        while(i<n){
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }

    }
}

class Main{
    public static void main(String args[]){
        Fibonacci obj = new Fibonacci();
        obj.input();
        obj.fibonacci();
    }

}
