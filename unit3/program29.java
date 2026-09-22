// Write a java program to implement Exception Propagation
class ExceptionPropagationExample {

  
    static void method1() {
        int data = 50 / 0; 
    }

 
    static void method2() {
        method1();
    }

 
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method: " + e);
        }
    }
}
