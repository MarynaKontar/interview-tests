package com.example.interviewtests;

/**
 * https://www.geeksforgeeks.org/anonymous-inner-class-java/
 * Anonymous Inner class that extends a class :
 * We can have an anonymous inner class that extends a class.
 * For example,we know that we can create a thread by extending a Thread class.
 * Suppose we need an immediate thread but we don’t want to create a class that extend Thread class all the time.
 * By the help of this type of Anonymous Inner class we can define a ready thread as follows
 *
 * @see AnonimousInnerClassThatDefinesInsideMethodOrConstructorArgument
 * @see AnonimousInnerClassThatImplementsAnInterface
 */
public class AnonimousClassThatExtendsClass {
    public static void main(String[] args) throws InterruptedException {
        //Here we are using Anonymous Inner class
        //that extends a Thread class
        Thread t = new Thread(){
            @Override
            public void run() {
                int n = 9;
                System.out.println("Child Thread" + n);
            }
//            @Override
//            public synchronized void start() { // sout START Main Thread, without "Child Thread" because start() is overrided and doesn't call run()
////                super.start(); // sout START Main Thread Child Thread
//                System.out.println("START");
//            }
        };
//        Thread t = new Thread(() -> System.out.println("Child Thread"));
        t.start();
//        Thread.sleep(2000);
        System.out.println("Main Thread");
    }
}
