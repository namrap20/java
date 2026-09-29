//Write a java program to use Local Inner Class 
class Outer {
    void show() {
        int number = 42;

        class Inner {
            void print() {
                System.out.println("Number: " + number);
            }
        }

        Inner inner = new Inner();
        inner.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
    }
}