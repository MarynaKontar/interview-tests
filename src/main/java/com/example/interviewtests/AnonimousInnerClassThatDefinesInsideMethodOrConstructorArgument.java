package com.example.interviewtests;

/**
 * https://www.geeksforgeeks.org/anonymous-inner-class-java/
 * Anonymous Inner class that defines inside method/constructor argument :
 * Anonymous inner classes in method/constructor arguments are often used in graphical user interface (GUI) applications.
 * To get you familiar with syntax lets have a look on the following program that creates
 * a thread using this type of Anonymous Inner class
 * @see AnonimousClassThatExtendsClass
 * @see AnonimousInnerClassThatImplementsAnInterface
 */
public class AnonimousInnerClassThatDefinesInsideMethodOrConstructorArgument {

    public static void main(String[] args)
    {
        //Here we are using Anonymous Inner class
        //that define inside argument, here constructor argument
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("AnonimousInnerClassThatDefinesInsideMethodOrConstructorArgument: Child Thread");
            }
        });

//        Thread t = new Thread(() -> System.out.println("AnonimousInnerClassThatDefinesInsideMethodOrConstructorArgument: Child Thread"));

        t.start();
        System.out.println("AnonimousInnerClassThatDefinesInsideMethodOrConstructorArgument: Main Thread");
    }
}
