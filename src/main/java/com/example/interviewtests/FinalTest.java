package com.example.interviewtests;

public class FinalTest {
//    https://stackabuse.com/non-access-modifiers-in-java/
//    The final Modifier
//    The keyword final can have one of three meanings:
//
//    to define named constants (variables whose values can't change after initialization)
//            to prevent a method from being overridden
//            to prevent a class from being inherited

    static final double GRAVITATIONAL_ACCELERATION = 9.81;

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        finalTest.changeObject1();
        System.out.println(finalTest.object1.a);
        System.out.println(finalTest.object1.b);
    }

    final MyClass object1 = new MyClass();
    MyClass object2 = new MyClass();

//    The reference variable object1 is indeed final and it's value can't change, but what does that mean for reference
//    variables anyway? It means that object1 can't change which object it is pointing to anymore, but we can change
//    the object itself. This is something that often confuses people:

    void changeObject1() {
        // object1 = object2; // Illegal!
        object1.a = 5; // Perfectly fine
    }
}


class MyClass {
    int a;
    int b;

    MyClass() {
        a = 2;
        b = 3;
    }
}