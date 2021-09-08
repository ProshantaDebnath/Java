class Animal{
    String properties="Animal are moves on place to another.";
}
class Dog extends Animal{
    String properties="Barking";
    void printColor(){
        System.out.println(properties);
        System.out.println(super.properties);
    }
}

public class ReferToParentClassInstanceVariable {

    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
    }
}
