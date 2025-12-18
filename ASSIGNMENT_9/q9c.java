class MyException extends Exception {


    MyException(String m, Throwable cause) {
        super(m, cause);
    }
}

public class q9c {

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e) {
            System.out.println("Caught MyException");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

    static void method1() throws MyException {
        try {
            int x = 10 / 0;  
        } catch (ArithmeticException e) {
            // chaining original exception
            throw new MyException("Error in method1", e);
        }
    }
}
