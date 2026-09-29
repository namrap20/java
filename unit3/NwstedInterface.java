//Write a java program to use Nested Interface 
class OuterClass {
    interface NestedInterface {
        void display();
    }
}

class Implementation implements OuterClass.NestedInterface {
    public void display() {
        System.out.println("Hello from Nested Interface!");
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedInterface obj = new Implementation();
        obj.display();
    }
}