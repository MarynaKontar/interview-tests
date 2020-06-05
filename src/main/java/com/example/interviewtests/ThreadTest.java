package com.example.interviewtests;

public class ThreadTest implements Runnable {
    int x = 0, y = 0;
    int addX() {x++; return x;}
    int addY() {y++; return y;}
    public void run() {
        for(int i = 0; i < 10; i++)
            System.out.println(addX() + " " + addY());
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
