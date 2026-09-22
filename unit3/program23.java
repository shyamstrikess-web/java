// Write a java program to implement Arithmetic Exception 
class SimpleException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
