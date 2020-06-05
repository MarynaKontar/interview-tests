package com.example.interviewtests;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThreadRunTest implements Runnable{

    AtomicInteger x = new AtomicInteger(0);
    AtomicInteger y = new AtomicInteger(0);
    int addX() {
        return x.addAndGet(1);
    }
    int addY() {
        return y.addAndGet(1);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + ": i: " + (i+1) + ":  " + addX() + " " + addY());
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

//  тоже порядок не гарантирован. гарантировано только AtomicInteger в monitor?????
