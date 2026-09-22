public class Main {
    public static void main(String[] args) {

        class Inner {
            void msg() {
                System.out.println("Hello World!");
            }
        }

        Inner in = new Inner();
        in.msg();
    }
}
