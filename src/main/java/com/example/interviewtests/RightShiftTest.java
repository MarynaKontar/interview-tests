package com.example.interviewtests;

public class RightShiftTest {

    public static void main(String[] args) {
//        The shift operators include left shift <<, signed right shift >>, and unsigned right shift >>>.
//        The value of n>>s is n right-shifted s bit positions with sign-extension.
//        The value of n>>>s is n right-shifted s bit positions with zero-extension.
//        >> is arithmetic shift right, >>> is logical shift right.
//
//        In an arithmetic shift, the sign bit is extended to preserve the signedness of the number.
//        For example: -2 represented in 8 bits would be 11111110 (because the most significant bit has negative weight).
//        Shifting it right one bit using arithmetic shift would give you 11111111, or -1. Logical right shift, however,
//        does not care that the value could possibly represent a signed number; it simply moves everything
//        to the right and fills in from the left with 0s. Shifting our -2 right one bit using logical shift would give 01111111.


//      The signed right shift operator ">>". Leftmost position after ">>" depends on sign extension.
        System.out.println("signed right shift operator \">>\"");
        System.out.println(16); //    10000
        System.out.println(16>>1); // 01000
        System.out.println(16>>2); // 00100
        System.out.println(16>>3); // 00010
        System.out.println(16>>4); // 00001
        System.out.println(16>>5); // 00000
        System.out.println(16>>6); // 00000


        System.out.println("signed right shift operator \">>\"");
        System.out.println(Integer.toBinaryString(-16) + ": " + -16); //
        System.out.println(Integer.toBinaryString(-16>>1) + ": " + (-16>>1)); //
        System.out.println(Integer.toBinaryString(-16>>2) + ": " + (-16>>2)); //
        System.out.println(Integer.toBinaryString(-16>>3) + ": " + (-16>>3)); //
        System.out.println(Integer.toBinaryString(-16>>4) + ": " + (-16>>4)); //
        System.out.println(Integer.toBinaryString(-16>>5) + ": " + (-16>>5)); //
        System.out.println(Integer.toBinaryString(-16>>6) + ": " + (-16>>6)); //


//        The unsigned right shift operator ">>>" shifts a zero into the leftmost position
        System.out.println("unsigned right shift operator \">>>\"");
        System.out.println(Integer.toBinaryString(16) + ": " + 16); //
        System.out.println(Integer.toBinaryString(16>>>1) + ": " + (16>>>1)); //
        System.out.println(Integer.toBinaryString(16>>>2) + ": " + (16>>>2)); //
        System.out.println(Integer.toBinaryString(16>>>3) + ": " + (16>>>3)); //
        System.out.println(Integer.toBinaryString(16>>>4) + ": " + (16>>>4)); //
        System.out.println(Integer.toBinaryString(16>>>5) + ": " + (16>>>5)); //
        System.out.println(Integer.toBinaryString(16>>>6) + ": " + (16>>>6)); //

        System.out.println("unsigned right shift operator \">>>\"");
        System.out.println(Integer.toBinaryString(-16) + ": " + (-16)); //
        System.out.println(Integer.toBinaryString(-16>>>1) + ": " + (-16>>>1)); //
        System.out.println(Integer.toBinaryString(-16>>>2) + ": " + (-16>>>2)); //
        System.out.println(Integer.toBinaryString(-16>>>3) + ": " + (-16>>>3)); //
        System.out.println(Integer.toBinaryString(-16>>>4) + ": " + (-16>>>4)); //
        System.out.println(Integer.toBinaryString(-16>>>5) + ": " + (-16>>>5)); //
        System.out.println(Integer.toBinaryString(-16>>>6) + ": " + (-16>>>6)); //





        System.out.println(Integer.toBinaryString(-1));
        // prints "11111111111111111111111111111111"
        System.out.println(Integer.toBinaryString(-1 >> 16));
        // prints "11111111111111111111111111111111"
        System.out.println(Integer.toBinaryString(-1 >>> 16));
        // prints "1111111111111111"

//        To make things more clear adding positive counterpart
        System.out.println(Integer.toBinaryString(121)); //  1111001
        System.out.println(Integer.toBinaryString(121 >> 1)); //  111100
        System.out.println(Integer.toBinaryString(121 >>> 1)); // 111100
    }
}
