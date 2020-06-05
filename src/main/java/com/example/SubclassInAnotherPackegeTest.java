package com.example;

import com.example.interviewtests.AbstractTest;

public class SubclassInAnotherPackegeTest extends AbstractTest {
    public static void main(String[] args) {
        AbstractTest.main(new String[] {});
//        SubclassInAnotherPackegeTest.main(new String[] {});
        System.out.println(SubclassInAnotherPackegeTest.someProtectedString);
//        System.out.println(SubclassInAnotherPackegeTest.someString); // !!!! не видна переменная с default модификатором,
//        так как с ним будет видно только для подклассов в том же пакете, где находится сам абстрактный класс.
    }
}
