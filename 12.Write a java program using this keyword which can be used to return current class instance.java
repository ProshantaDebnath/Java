public class ReturnCurrentClassInstance {
    ReturnCurrentClassInstance getReturnCurrentClassInstance(){
        return this;
    }

    void message(){
        System.out.println("Hello, World!");
        
    }

}

class Main{
    public static void main(String args[]){
        new ReturnCurrentClassInstance().getReturnCurrentClassInstance().message();
    }
}
