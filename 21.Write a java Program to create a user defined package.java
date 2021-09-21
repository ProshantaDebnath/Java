package package1;

public class ClassA {
   public void display(){
        System.out.println("ClassA inside package 1");
    }
}

package package2;

public class ClassB {
    public void display(){
        System.out.println("ClassB inside package 2");
    }
}

import package1.ClassA;
import package2.*;

public class UserDefinePackage {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        obj1.display();
        ClassB obj = new ClassB();
        obj.display();
    }
}
