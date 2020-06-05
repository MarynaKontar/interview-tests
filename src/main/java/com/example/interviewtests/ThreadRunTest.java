package com.example.interviewtests;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadRunTest implements Runnable


//What will be the output of the program?
{
    int x = 0, y = 0;
    int addX() {x++; return x;}
    int addY() {y++; return y;}
    public void run() {
        for(int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + ": i: " + (i+1) + ":  " + addX() + " " + addY());
//            System.out.println(addX() + " " + addY());
//        while (true){}


    }
    public static void main(String args[])
    {
        ThreadRunTest run1 = new ThreadRunTest();
        ThreadRunTest run2 = new ThreadRunTest();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }
}



//        A.Compile time Error: There is no start() method
//        B.Will print in this order: 1 1 2 2 3 3 4 4 5 5...
//        C.Will print but not exactly in an order (e.g: 1 1 2 2 1 1 3 3...)    !!!!!!!!!!!!!!!!
//        D.Will print in this order: 1 2 3 4 5 6... 1 2 3 4 5 6...
//
//        Correct Answer: Option C
//        Explanation:
//        Both threads are operating on different sets of instance variables.
//        If you modify the code of the run() method to print the thread name it will help to clarify the output:
//
//        public void run() {
//        for(int i = 0; i < 10; i++)
//            System.out.println(Thread.currentThread().getName() + ": " + addX() + " " + addY());
//        }

// add volatile to x or лучше AtomicInteger, x= newAtomicInteger(x)) - thread save  => см. AtomicThreadRunTest