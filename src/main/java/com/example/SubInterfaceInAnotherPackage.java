package com.example;

import com.example.interviewtests.InterfaceTest;

/**
 * @see com.example.interviewtests.InterfaceTest.Foo
 */
public interface SubInterfaceInAnotherPackage extends InterfaceTest.Foo {


}

class ClassThatImplementInterfaceInAnotherPackage implements SubInterfaceInAnotherPackage{
    public static void main(String[] args) {
        System.out.println(k);
    }
}
