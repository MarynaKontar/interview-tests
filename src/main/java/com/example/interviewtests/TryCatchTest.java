package com.example.interviewtests;

public class TryCatchTest {

    public static void main(String[] args) {

        // Example 1
        try {
            int x = 0;
            int y = 5 / x;
        } catch (Exception e) {
            System.out.println("Exception");
//        } catch (ArithmeticException ae) {
//            System.out.println(" Arithmetic Exception");
        }
        System.out.println("finished");

//      Example 2
        try {
            badMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }

    static void badMethod() {
        throw new Error(); /* Line 22 */
    }
}
//        Example 1
//        A.finished
//        B.Exception
//        C.Compilation fails.     !!!!!!!!!!!!!!!!!
//        D.Arithmetic Exception
//        Correct Answer: Option C
//        Explanation:
//        Compilation fails because ArithmeticException has already been caught. ArithmeticException is a subclass of
//        java.lang.Exception, by time the ArithmeticException has been specified it has already been caught by the Exception class.
//        If ArithmeticException appears before Exception, then the file will compile. When catching exceptions the more
//        specific exceptions must be listed before the more general (the subclasses must be caught before the superclasses).




//        Example 2
//        A.ABCD
//        B.Compilation fails.
//        C.C is printed before exiting with an error message.    !!!!!!!!!!!!!!
//        D.BC is printed before exiting with an error message.
//        Correct Answer: Option C
//        Explanation:
//        Error is thrown but not recognised line(22) because the only catch attempts to catch an Exception and Exception
//        is not a superclass of Error. Therefore only the code in the finally statement can be run before exiting with a
//        runtime error (Exception in thread "main" java.lang.Error).
