package com.example.interviewtests;

public class HeapStaticReferenceTest1 {

    // static block
    static {
        System.out.println("Static block " + HeapStaticReferenceTest1.staticInt); // will be  "Static block 0" even if public static int staticInt = 15;
//        because static block executed before assignment to static variables. Will be printed only ONCE, when this class first instantiated or static member has been called
    }

    // non-static block (executed for each instance of the class)
    {
        System.out.println("NON static block " + HeapStaticReferenceTest1.staticInt); // will be printed for each instance of StaticTest class
    }

    // another static block (static blocks executed in order of appearance in the class)
    static {
        System.out.println("Hello from the static block! 2");
    }

    public static int staticInt = 15;
    public int normalInt = 0;

    // We'll use this example to show how we can keep track of how many objects
    // of our class were created, by changing the shared staticInt variable
    public HeapStaticReferenceTest1() {
        System.out.println("Hello from the constructor!");
        staticInt++;
        normalInt++;
    }

    public static void main(String[] args) {
        // No instances of StaticExample have been created yet
        System.out.println(HeapStaticReferenceTest1.staticInt); // Prints: 0
// System.out.println(StaticExample.normalInt); // this won't work, obviously

// Let's create two instances of StaticExample
        HeapStaticReferenceTest1 object1 = new HeapStaticReferenceTest1();
// We can refer to static variables via an object reference as well,
// however this is not common practice, we usually access them via class name
// to make it obvious that a variable/method is static
        System.out.println(object1.staticInt); // Prints: 16
        System.out.println(object1.normalInt); // Prints: 1

        HeapStaticReferenceTest1 object2 = new HeapStaticReferenceTest1();
        System.out.println(object2.staticInt); // Prints: 17
        System.out.println(object2.normalInt); // Prints: 1

// We can see that increasing object2's staticInt
// increases it for object1 (and all current or future objects of that class)

        object1.staticInt = 10;
        object1.normalInt = 10;
        System.out.println(object2.staticInt); // Prints: 10
        System.out.println(object2.normalInt); // Prints: 1 (object2 retained its own value for normalInt as it depends on the class itself)


    }
}
