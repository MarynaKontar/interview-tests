package com.example.interviewtests;

public class CharTest {

////    Which three are valid declarations of a char?
//
    char c1 = 064770;
//    char c2 = 'face';
    char c3 = 0xbeef;
//    char c4 = \u0022;
//    char c5 = '\iface';
    char c6 = '\uface';


    public static void main(String[] args) {
        char[] ch = {'d', 'f', 'g'};
        System.out.println(ch[0]); // d, так как переопределен метод print
        System.out.println(Character.getNumericValue(ch[0])); // 13
        System.out.println(ch[0] + 70); // 170 (код для 'd' = 13 + 70 = 87 ???????)

    }
}


//    (1), (3), and (6) are correct. char c1 = 064770; is an octal representation of the integer value 27128, which is legal because it fits into an unsigned 16-bit integer. char c3 = 0xbeef; is a hexadecimal representation of the integer value 48879, which fits into an unsigned 16-bit integer. char c6 = '\uface'; is a Unicode representation of a character.
//    char c2 = 'face'; is wrong because you can't put more than one character in a char literal. The only other acceptable char literal that can go between single quotes is a Unicode value, and Unicode literals must always start with a "backslash u".
//    char c4 = \u0022; is wrong because the single quotes are missing.
//    char c5 = '\iface'; is wrong because it appears to be a Unicode representation (notice the backslash), but starts with '\i' rather than "backslash u".




//    What is the numerical range of a char?
//
//    A.	-128 to 127
//    B.	-(215) to (215) - 1
//    C.	0 to 32767
//    D.    0 to 65535
//    Answer: Option D
//    Explanation:
//    A char is really a 16-bit integer behind the scenes, so it supports 216 (from 0 to 65535) values.
