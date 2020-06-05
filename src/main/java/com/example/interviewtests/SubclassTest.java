package com.example.interviewtests;

/**
 * @see InterfaceTest
 */
public class SubclassTest extends AbstractTest {

    // see InterfaceTest
    public static void main(String[] args) {
        someDefaultModifierString = "AbstractTest someString";
        System.out.println(AbstractTest.class.getName() + ": " + someDefaultModifierString);
        System.out.println(AbstractTest.class.getName() + ": " + someProtectedString); // !!!! видна переменная с default модификатором,
//        так как с ним будет видно только для подклассов в том же пакете, где находится сам абстрактный класс.

        System.out.println(AbstractTest.class.getName() + ": " );
        System.out.println(AbstractTest.class.getName() + ": " + AbstractTest.someDefaultModifierString);
        System.out.println(AbstractTest.class.getName() + ": " + AbstractTest.someProtectedString);
        System.out.println(AbstractTest.class.getName() + ": " + AbstractTest.method());

        System.out.println(SubclassTest.class.getName() + ": " );
        System.out.println(SubclassTest.class.getName() + ": " + SubclassTest.someDefaultModifierString);
        System.out.println(SubclassTest.class.getName() + ": " + SubclassTest.method());
        System.out.println(SubclassTest.class.getName() + ": " + SubclassTest.someProtectedString);

        System.out.println(AbstractTest.class.getName() + ": main" );
        AbstractTest.main(new String[]{" ", " "});
        System.out.println(InterfaceTest.SomeInnerClass.k);
    }
}
