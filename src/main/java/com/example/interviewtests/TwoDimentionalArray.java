package com.example.interviewtests;

import java.util.*;

public class TwoDimentionalArray {

    public static void main(String[] args) {
//        2D Array
        int[][] someIntList = { {1,2,3}, {4, 5, 6} };
//        int[][] someIntList = { {1,2,3, 111}, {4, 5, 6} };
        System.out.println("2D Array");
        for (int i = 0; i < 2  ; i++) { // columns
            for (int j = 0; j < someIntList.length + 1; j++) { // rows
                System.out.println(someIntList[i][j]);
            }
        }
        System.out.println("2D Array");
        System.out.println(someIntList[0][0]);
        System.out.println(someIntList[0][1]);
        System.out.println(someIntList[0][2]);
//        System.out.println(someIntList[0][3]);
        System.out.println(someIntList[1][0]);
        System.out.println(someIntList[1][1]);
        System.out.println(someIntList[1][2]);



        System.out.println("2D ArrayList :");

        /*Printing 2D ArrayList*/
        System.out.println(create2DArrayList());


        System.out.println("2D LinkedHashSet :");

        /*Printing 2D LinkedHashSet*/
        System.out.println(create2DLinkedHashSet());

//        // print 2D array
//        int[] a6[], b6 = { 20 };
//        a6 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a6[i][j] = 100 + i;
//                System.out.println(a6[i][j]);
//            }
//        }





    }





    /*function for creating and returning 2D ArrayList*/
    static List create2DArrayList()
    {
        /*Declaring 2D ArrayList*/
        ArrayList<ArrayList<Integer>> x
                = new ArrayList<ArrayList<Integer> >();

        /*one space allocated for 0th row*/
        x.add(new ArrayList<Integer>());

        /*Adding 3 to 0th row created above x(0, 0)*/
        x.get(0).add(0, 3);

        /*Creating 1st row and adding values
       (another way for adding values in 2D collections)*/
        x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));

        /*Add 366 to 1st row 0th column x(1, 0)*/
        x.get(1).add(0, 366);

        /*Add 576 to 1st row 4th column x(1, 4)*/
        x.get(1).add(4, 576);

        /*Adding values to 2nd row*/
        x.add(2, new ArrayList<>(Arrays.asList(3, 84)));

        /*Adding values to 3rd row*/
        x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));

        /*Adding values to 4th row*/
        x.add(new ArrayList<>(Arrays.asList(8)));

        return x;
    }


    static Set create2DLinkedHashSet()
    {
        /*Declaring 2D LinkedHashSet*/
        LinkedHashSet<LinkedHashSet<String>> x
                = new LinkedHashSet<LinkedHashSet<String> >();

        /*Creating 1st row */
        x.add(new LinkedHashSet<String>(
                Arrays.asList("Apple", "Orange")));

        // Creating 2nd row, here "Coffee" will be
        // considered as only one object
        // to maintain uniqueness
        x.add(new LinkedHashSet<String>(
                Arrays.asList("Tea",
                        "Coffee",
                        "Milk",
                        "Coffee",
                        "Water")));

        /* Creating 3rd row */
        x.add(new LinkedHashSet<String>(
                Arrays.asList("Tomato",
                        "Potato",
                        "Onion")));

        // Creating 4th row but it will not
        // be added as it contains the same items as 3rd row
        // (LinkedHashSet inserts only unique items)
        x.add(new LinkedHashSet<String>(
                Arrays.asList("Tomato", "Potato", "Onion")));

        return x;
    }
}


//        int a3[][]; // valid
//        int[][] b3; // valid
//        int[][] c3; // valid
//        int[] d3[]; // valid
//        int[][] e3; // valid
//        int[] f3[]; // valid
////        [][] int g3; // invalid
////        [] int[] h3; // invalid
//
//
//
//        // Here, 'a' is two dimensional array, 'b'
//        // is two dimensional array
//        int[] a4[], b4[];
//
//        // Here, 'c' is two dimensional array, 'd'
//        // is two dimensional array
//        int[] c4[], d4[];
//
//        // Here, 'e' is two dimensional array, 'f'
//        // is three dimensional array
//        int[][] e4, f4[];
//
//        // Here, 'g' is two dimensional array,
//        // 'h' is one dimensional array
//        int[] g4[], h4;
//
//
//        int[] a5[] = { { 1, 1, 1 }, { 2, 2, 2 },
//                { 3, 3, 3 } }, b5 = { 20 };

//
//        int[] myArray [] = new int[2][3];
//        myArray[0][0] = 2;
//        Object myObjects [] = {new Object(), new Object()};
