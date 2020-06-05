package com.example.interviewtests;

/**
 * https://www.geeksforgeeks.org/anonymous-inner-class-java/
 * Anonymous Inner class that implements a interface :
 * We can also have an anonymous inner class that implements an interface.
 * For example, we also know that by implementing Runnable interface we can create a Thread.
 * Here we use anonymous Inner class that implements an interface.
 * @see AnonimousInnerClassThatDefinesInsideMethodOrConstructorArgument
 * @see AnonimousClassThatExtendsClass
 */
public class AnonimousInnerClassThatImplementsAnInterface {

   static int d;
   private static final int dd = 7;
    public static void main(String[] args)
    {
        //Here we are using Anonymous Inner class
        //that implements a interface i.e. Here Runnable interface
        Runnable r = new Runnable() {
//            static{ } // !!! We cannot declare static initializers
//            interface B { } // !!!We cannot declare member interfaces in an anonymous class.
//            static int fff = 67; // !!! An anonymous class can have static members only if they are constant variables.
            {
                System.out.println("initialization");
            }
            static final int ff = 67;
            int fff = 123;
            @Override
            public void run() {
//                int d = 35; // перекрывают переменные верхнего класса (shadows)
//                int dd = 8;
                fff = 245;
                System.out.println("AnonimousInnerClassThatImplementsAnInterface: Child Thread" + d + dd + ff + fff);
                System.out.println(new LocalClass());
            }
            class LocalClass {
                public LocalClass() {
                    System.out.println("localClass");
                }
            }

        };
//        Runnable r = () -> System.out.println("AnonimousInnerClassThatImplementsAnInterface: Child Thread");
        Thread t = new Thread(r);
        t.start();
        System.out.println("AnonimousInnerClassThatImplementsAnInterface: Main Thread");
    }
}


//        Difference between Normal/Regular class and Anonymous Inner class:
//
//        A normal class can implement any number of interfaces but anonymous inner class can implement only one interface at a time.
//        A regular class can extend a class and implement any number of interface simultaneously. But anonymous Inner class can extend a class or can implement an interface but not both at a time.
//        For regular/normal class, we can write any number of constructors but we cant write any constructor for anonymous Inner class because anonymous class does not have any name and while defining constructor class name and constructor name must be same.
//        Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class
//        Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:
//
//        An anonymous class has access to the members of its enclosing class.
//        An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
//        Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope that have the same name.
//        Anonymous classes also have the same restrictions as local classes with respect to their members:
//
//        We cannot declare static initializers or member interfaces in an anonymous class.
//        An anonymous class can have static members provided that they are constant variables.

//        Note that you can declare the following in anonymous classes:
//        Fields
//        Extra methods (even if they do not implement any methods of the supertype)
//        Instance initializers
//        Local classes
//        However, constructors can not be declared in an anonymous class.