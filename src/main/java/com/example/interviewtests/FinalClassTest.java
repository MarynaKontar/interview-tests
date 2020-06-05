package com.example.interviewtests;

public class FinalClassTest {
//    A class defined with final (SomeFinalClass) cannot be inherited.
//    This of course implicitly declares all methods of that class final
//    as well (they can't be overridden if the class can't be inherited in the first place).

}


final class SomeFinalClass {
    void someMethod() { // this method is final, even if we are not declare this

    }
}

//class SubclassOfFinalClassCantBeExist extends SomeFinalClass {
////    !!!!!! cant be inherited from final class
//}