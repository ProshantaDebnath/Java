class Animal{
    void properties(){
        System.out.println("Animal can make sounds..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
        System.out.println("Dog is barking and biting.");
    }
}

public class SingleInheritance {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.properties();
        dog.bark();
    }
}
