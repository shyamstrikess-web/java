//write a java program to use simple inner class in your program 
public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.display();
    }
}

class Outer {
    String msg = "Hello from Inner Class!";

    class Inner {
        void display() {
            System.out.println(msg);
        }
    }
}
