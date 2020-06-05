package com.example.interviewtests;

public class DataTypes {
//    https://www.indiabix.com/java-programming/language-fundamentals/001003

//    Which three are valid declarations of a float?

    float f1 = -343;
//    float f2 = 3.14;
    float f3 = 0x12345;
//    float f4 = 452e7;
//    float f5 = 2001.0D;
    float f6 = 2.81F;
//    A.	1, 2, 4
//    B.	2, 3, 5
//    C.	1, 3, 6   !!!!!!!!
//    D.	2, 4, 6
//    Answer: Option C
//      Explanation:
//    (1) and (3) are integer literals (32 bits), and integers can be legally assigned to floats (also 32 bits).
//    (6) is correct because (F) is appended to the literal, declaring it as a float rather than a double (the default for floating point literals).
//    (2), (4),and (5) are all doubles.




//    Which is a valid declarations of a String?

    	String s1 = null;
//    B.	String s2 = 'null';
//    C.	String s3 = (String) 'abc';
//    D.	String s4 = (String) '\ufeed';
//    Answer: Option A
//
//    Explanation:
//    Option A sets the String reference to null.
//    Option B is wrong because null cannot be in single quotes.
//    Option C is wrong because there are multiple characters between the single quotes ('abc') (single quotes for char).
//    Option D is wrong because you can't cast a char (primitive) to a String (object).




//    What is the numerical range of a char?
//
//    A.	-128 to 127
//    B.	-(215) to (215) - 1
//    C.	0 to 32767
//    D.    0 to 65535
//    Answer: Option D
//    Explanation:
//    A char is really a 16-bit integer behind the scenes, so it supports 216 (from 0 to 65535) values.


//        boolean b = Boolean.FALSE;
}
