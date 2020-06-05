package com.example.interviewtests;

/**
 * @see SubclassTest
 */
public abstract class AbstractTest {
    // !!! see SubclassTest
    private static String somePrivateString = "somePrivateString";
    protected static String someProtectedString = "someProtectedString";
    static String someDefaultModifierString = "dfdre";
    static {
        System.out.println("STATIC block from AbstractTest class");
        someDefaultModifierString = "someString";
        somePrivateString = "somePrivateStringddddddd";
        System.out.println(someDefaultModifierString);
        System.out.println(somePrivateString);
        System.out.println(someProtectedString);
        final String anotherString = "anotherString";
        System.out.println(anotherString);
        System.out.println("STATIC block from AbstractTest class END");
    }

    static String method() {
        return AbstractTest.class.getName();
    };

    // !!!! COMPILATION ERROR can't have abstract static method (only or abstract or static)
    // because we can call static method when we don't have instance and so don't have body of abstract static method.
//    abstract static String method() {
//        return AbstractTest.class.getName();
//    };

    public static void main(String[] args) {
        System.out.println(AbstractTest.method());
        System.out.println(AbstractTest.someDefaultModifierString);
        System.out.println(AbstractTest.somePrivateString);
    }

}
