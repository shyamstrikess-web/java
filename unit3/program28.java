//Write a java program to implement custom exception 
// 1. Define custom exception
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

// 2. Test it
class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom error!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}