package com.example.interviewtests;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class PassA {
    static boolean b1, b2;
    public static void main(String [] args)
    {
//        PassA p = new PassA();
//        p.start();
//    }
//
//    void start()
//    {
//        long [] a1 = {3,4,5};
//        long [] a2 = fix(a1);
//        System.out.print(a1[0] + a1[1] + a1[2] + " ");
//        System.out.println(a2[0] + a2[1] + a2[2]);
//    }
//
//    long [] fix(long [] a3) {
//        a3[1] = 7;
//        return a3;

//        int x = 0;
//        if ( !b1 ) /* Line 7 */
//        {
//            if ( !b2 ) /* Line 9 */
//            {
//                b1 = true;
//                x++;
//                if ( 5 > 6 )
//                {
//                    x++;
//                }
//                if ( !b1 )
//                    x = x + 10;
//                else if ( b2 = true ) /* Line 19 */
//                    x = x + 100;
//                else if ( b1 | b2 ) /* Line 21 */
//                    x = x + 1000;
//            }
//        }
//        System.out.println(x);





//        System.out.print("Start ");
//        try
//        {
//            System.out.print("Hello world");
//            throw new FileNotFoundException();
//        }
////        System.out.print(" Catch Here "); /* Line 7 */
//    catch(EOFException e)
//        {
//            System.out.print("End of file exception");
//        }
//    catch(FileNotFoundException e)
//        {
//            System.out.print("File not found");
//        }

//        and given that EOFException and FileNotFoundException are both subclasses of IOException, and further assuming this block of code is placed into a class, which statement is most true concerning this code?
//            A.
//                    The code will not compile.
//        B.
//                Code output: Start Hello world File Not Found.
//        C.
//                Code output: Start Hello world End of file exception.
//            D.
//            Code output: Start Hello world Catch Here File not found.


//        System.out.println(16>>2);
//        System.out.println(16*4);
//        System.out.println(16/2^2);
//        System.out.println(16>>>2);


//        try
//        {
//            int x = 0;
//            int y = 5 / x;
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception");
//        }
////        catch (ArithmeticException ae)
////        {
////            System.out.println(" Arithmetic Exception");
////        }
//        System.out.println("finished");









    }


}






//            What will be the output of the program (when you run with the -ea option) ?
//
//public class AbstractTest
//{
//    public static void main(String[] args)
//    {
//        int x = 0;
//        assert (x > 0) : "assertion failed"; /* Line 6 */
//        System.out.println("finished");
//    }
//}
//	A.
//            finished
//            B.
//            Compilation fails.
//            C.
//            An AssertionError is thrown.
//            D.
//            An AssertionError is thrown and finished is output.
//            [#]
//            18.
//            What will be the output of the program?
//
//public class CommandArgs
//{
//    public static void main(String [] args)
//    {
//        String ThreadRunTest = args[1];
//        String s2 = args[2];
//        String s3 = args[3];
//        String s4 = args[4];
//        System.out.print(" args[2] = " + s2);
//    }
//}
//    and the command-line invocation is
//
//        > java CommandArgs 1 2 3 4
//
//        A.
//        args[2] = 2
//        B.
//        args[2] = 3
//        C.
//        args[2] = null
//        D.
//        An exception is thrown at runtime.
//        [#]
//        19.
//        What will be the output of the program ?
//
//public class AbstractTest
//{
//    public static void main(String [] args)
//    {
//        signed int x = 10;
//        for (int y=0; y<5; y++, x--)
//            System.out.print(x + ", ");
//    }
//}
//	A.
//            10, 9, 8, 7, 6,
//            B.
//            9, 8, 7, 6, 5,
//            C.
//            Compilation fails.
//            D.
//            An exception is thrown at runtime.
//            [#]
//            20.
//            What will be the output of the program?
//
//            import java.util.*;
//class H
//{
//    public static void main (String[] args)
//    {
//        Object x = new Vector().elements();
//        System.out.print((x instanceof Enumeration)+",");
//        System.out.print((x instanceof Iterator)+",");
//        System.out.print(x instanceof ListIterator);
//    }
//}
//	A.
//            Prints: false,false,false
//            B.
//            Prints: false,false,true
//            C.
//            Prints: false,true,false
//            D.
//            Prints: true,false,false
