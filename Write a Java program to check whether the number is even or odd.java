import java.util.Scanner;

public class OddEven {
    int n;
    Scanner input = new Scanner(System.in);


    void input() {
        System.out.println("Enter the number:");
        n = input.nextInt();
    }

    void OddEvenCheck() {
        if (n % 2 == 0) {
            System.out.println("The number is Even.");
        } else
            System.out.println("The number is Odd.");
    }
    }
    class Main {
        public static void main(String args[]) {

            OddEven obj = new OddEven();
            obj.input();
            obj.OddEvenCheck();

        }
    }
