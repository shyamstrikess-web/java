// Write a java program to use Multiple Catch Block
class SimpleMultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}
