import java.util.Scanner;

public class Factorial {
    int n;
    Scanner input = new Scanner(System.in);
    void input(){
        System.out.print("Enter an integer: ");
        n = input.nextInt();
    }
    
    void Fact(){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
     System.out.println("Factorial of " + n +" is:" + fact);
    }
}

class Main{
public static void main(String args[]){
        Factorial obj= new Factorial();
        obj.input();
        obj.Fact();
        }

}
