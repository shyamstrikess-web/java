class Outer {
    static String msg = "Hello from Static Inner Class!";

    static class Inner {
        void show() {
            System.out.println(msg);
        }
    }
}
 class Main {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
