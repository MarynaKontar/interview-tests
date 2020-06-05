package com.example.interviewtests;

import java.sql.Array;
import java.util.*;

import static java.lang.Integer.valueOf;

public class ArrayTest {
    public static void main(String[] args) {
//        https://www.indiabix.com/java-programming/language-fundamentals/001003
//        https://www.geeksforgeeks.org/multidimensional-collections-in-java/
//        https://www.geeksforgeeks.org/multidimensional-arrays-in-java/
        int[] a6[], b6 = { 20 };
        a6 = new int[3][3];
        b6 = new int[3];

        // print 1D array
        for (int i = 0; i < 3; i++)
            System.out.println(b6[i]);

        // print 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a6[i][j] = 100 + i;
                System.out.println(a6[i][j]);
            }
        }

        // can use short and byte (they less than int)? but not long in for(...)
        int[] array = new int[12];
        for (byte i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (short i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        // in for we can use not only i++, but something like node.next
//        for (Node node = first; node != null; node = node.next) {
//            list.add(node.item);
//        }
    }


////    8.
////    Which one of the following will declare an array and initialize it with five numbers?
//    int [] a = {23,22,21,20,19};

}


//        int[] a1; // valid declaration
//        int b1[]; // valid declaration
//        int[] c1; // valid declaration
//
//
//        // invalid declaration -- If we want to assign
//        // size of array at the declaration time,  it
//        // gives compile time error.
////        int a2[5];
//
//
//
//
//        // valid declaration, both arrays are
//        // one dimensional array.
//        int a[], b[];
//
////        // invalid declaration
////        int c[], [] d;
////
////        // invalid declaration
////        int[] e, [] f;
//
//        // invalid, here size of array is not given
////        int[] aa = new int[];
//
//        // valid, here creating 'b' array of size 5
//        int[] bb = new int[5];
//
//        // valid
//        int[] cc = new int[0];
//
//        // gives runtime error
////        int[] ddd = new int[-1];
//
//
//
//
//
//        int a3[][]; // valid
//        int[][] b3; // valid
//        int[][] c3; // valid
//        int[] d3[]; // valid
//        int[][] e3; // valid
//        int[] f3[]; // valid
////        [][] int g3; // invalid
////        [] int[] h3; // invalid
//