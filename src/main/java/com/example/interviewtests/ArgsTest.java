package com.example.interviewtests;

public class ArgsTest {
    public static void main(String [] args)
    {
        String s0 = args[0];
        String s1 = args[1];
        String s2 = args[2];
        String s3 = args[3];
        String s4 = args[4];
        System.out.print(" args[2] = " + s2);

    }

//    and the command-line invocation is
//    java ArgsTest 1 2 3 4   !!!!! не выходит Error: Could not find or load main class ArgsTest

//    An exception is thrown at runtime.

}
