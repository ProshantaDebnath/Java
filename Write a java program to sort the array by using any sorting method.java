import java.util.Scanner;
public class BubbleSort {
    int n, i, j, temp;
    int arr[] = new int[50];
    int Array[] = new int[arr.length] ;
    Scanner scan = new Scanner(System.in);

    BubbleSort(){
        System.out.print("Enter the size of Array : ");
        n = scan.nextInt();
        System.out.print("Enter Array Elements : "+" ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        for(i=0;i<arr.length;i++){
           Array[i]=arr[i];
        }
    }

    void bubbleSort(){
        for(i=0;i<n-1;i++){
          for(j=0;j<n-i-1;j++){
              if(Array[j]>Array[j+1]){
                  temp=Array[j];
                  Array[j]=Array[j+1];
                  Array[j+1]=temp;
               }
          }
        }
    }

    void printArray(){
        System.out.print("New Array is :\n");
        for(i=0; i<n; i++)
        {
            System.out.print(Array[i]+ "  "+" ");
        }
    }
}



class Main{
    public static void main(String args[]){
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort();
        obj.printArray();
    }
}
