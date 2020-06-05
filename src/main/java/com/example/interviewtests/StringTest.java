package com.example.interviewtests;

import java.util.Arrays;

public class StringTest {
    // HashMAp must have immutable key!!!!! (String, for example)
    //String is IMMUTABLE, final
//    https://javarevisited.blogspot.com/2010/10/why-string-is-immutable-or-final-in-java.html
//    The string is Immutable in Java because String objects are cached in String pool.

//    String was made final so that no one can compromise invariant of String class e.g. Immutability,
// Caching, hashcode calculation etc by extending and overriding behaviors.
// Another reason of why String class is immutable could die due to HashMap.
//    Since Strings are very popular as HashMap key, it's important for them to be immutable so that they can
// retrieve the value object which was stored in HashMap. Since HashMap works in the principle of hashing,
// which requires same has value to function properly.
// Mutable String would produce two different hashcodes at the time of insertion and retrieval if contents of
// String was modified after insertion, potentially losing the value object in the map.

//    Why String is final in Java, by making java.lang.String final, Java designer ensured that no one overrides any
// behavior of String class.
//The absolutely most important reason that String is immutable is that it is used by the class loading mechanism


//    public static void stringReplace(String text) {
//        text = text.replace('j', 'c'); /* Line 5 */
//    }
//
//    public static void bufferReplace(StringBuffer text) {
//        text = text.append("c");  /* Line 9 */
//    }
//
//    public static void main(String args[]) {
//        String textString = new String("java");
//        StringBuffer textBuffer = new StringBuffer("java"); /* Line 14 */
//        stringReplace(textString);
//        bufferReplace(textBuffer);
//        System.out.println(textString + textBuffer);
//    }









//  То же самое, но с sout
    static String textString;
    static StringBuffer textBuffer;
    static int[] x = {1, 23, 58};
    public static void stringReplace(String text) {
        text = text.replace('j', 'c'); /* Line 5 */
        System.out.println("stringReplace textString: " + textString);
        System.out.println("stringReplace: " + text);
    }

    public static void bufferReplace(StringBuffer text) {
//        text = text.append("c");  /* Line 9 */
        text = text.replace(1,2,"cff");
        System.out.println("bufferReplace textBuffer: " + textBuffer);
        System.out.println("bufferReplace: " + text);
    }

    public static void main(String args[]) {
        textString = new String("java");
        textBuffer = new StringBuffer("java"); /* Line 14 */
        stringReplace(textString);
        System.out.println("After stringReplace: " + textString);
        bufferReplace(textBuffer);
        System.out.println(textString + textBuffer);

        changeIntArray(x);
        System.out.println("x: " + Arrays.toString(x));

    }

    private static int changeIntArray(int[] y) {
        y[2] = 5999;
        System.out.println("y: " + Arrays.toString(y));
        System.out.println("x: " + Arrays.toString(x));
        return 4;
    }


}


//    A.java
//    B.javac
//    C.javajavac           !!!!!!!!!!!!!!!!!!!!!!!!!!
//    D.Compile error
//
//    Correct Answer: Option C
//    Explanation:
//    A string is IMMUTABLE, it cannot be changed, that's the reason for the StringBuffer class.
//    The stringReplace method does not change the string declared on line 14, so this remains set to "java".
//    Method parameters are always passed by value - a copy is passed into the method - if the copy changes,
//    the original remains intact, line 5 changes the reference i.e. text points to a new String object, however
//    this is lost when the method completes. The textBuffer is a StringBuffer so it can be changed.
//    This change is carried out on line 9, so "java" becomes "javac", the text reference on line 9 remains unchanged.
//    This gives us the output of "javajavac"
