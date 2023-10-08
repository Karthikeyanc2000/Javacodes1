class Outer {
    static class StaticInner {
        void display() {
            System.out.println("This is the StaticInner class.");
        }
    }
}

class Child extends Outer.StaticInner {
    void childDisplay() {
        System.out.println("This is a method in the Child class.");
    }
}

public class Karthik {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();      // Call method from StaticInner class
        child.childDisplay(); // Call method from Child class
    }
}
