public class PassArugConsturctorCall {
    NewClass obj;
    PassArugConsturctorCall(NewClass obj){
        this.obj=obj;
    }

    void displayData(){
        System.out.println("After passing the data through by Constructor call is : "+obj.data);
    }
}

class NewClass{
    int data=10;
    NewClass(){
        PassArugConsturctorCall passArugment = new PassArugConsturctorCall(this);
        passArugment.displayData();
        System.out.println("Before passing newClass data is: "+ data);
    }
    public static void main(String args[]){
        NewClass object = new NewClass();
    }
}
