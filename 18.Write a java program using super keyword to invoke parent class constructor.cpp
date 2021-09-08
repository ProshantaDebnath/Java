class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is barking.");
    }
}
public class InvokeParentClassConstructor {
    public static void main(String args[]) {
        Dog obj = new Dog();
    }
}
