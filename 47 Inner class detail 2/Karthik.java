class Outer {
    int outerVar = 10;

    // Non-static inner class
    class Inner {
        int innerVar = 20;

        void innerMethod() {
            System.out.println("Inner method: outerVar = " + outerVar + ", innerVar = " + innerVar);
        }
    }

    // Static inner class
    static class StaticInner {
        static int staticInnerVar = 30;

        static void staticInnerMethod() {
            System.out.println("StaticInner method: staticInnerVar = " + staticInnerVar);
        }
    }
}

public class Karthik
 {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        Outer outer = new Outer();

        // Creating an instance of the non-static inner class
        Outer.Inner inner = outer.new Inner();

        // Creating an instance of the static inner class
        Outer.StaticInner staticInner = new Outer.StaticInner();

        // Accessing members and methods of the inner classes
        inner.innerMethod();
        staticInner.staticInnerMethod();
    }
}
