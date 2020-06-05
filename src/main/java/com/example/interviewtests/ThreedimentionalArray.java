package com.example.interviewtests;

public class ThreedimentionalArray {

//    Syntax:
//    x[array_index][row_index][column_index]
    public static void main(String[] args)
    {

        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + arr[i][j][z]);
    }

//    Output:
//    arr[0][0][0] = 1
//    arr[0][0][1] = 2
//    arr[0][1][0] = 3
//    arr[0][1][1] = 4
//    arr[1][0][0] = 5
//    arr[1][0][1] = 6
//    arr[1][1][0] = 7
//    arr[1][1][1] = 8



//    public static void main(String[] args)
//    {
//
//        int[][][] arr = { { { 1, 2 }, { 3, 4 } },
//                { { 5, 6 }, { 7, 8 } } };
//
//        for (int i = 0; i < 2; i++) {
//
//            for (int j = 0; j < 2; j++) {
//
//                for (int k = 0; k < 2; k++) {
//
//                    System.out.print(arr[i][j][k] + " ");
//                }
//
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//}
//Output:
//        1 2
//        3 4
//
//        5 6
//        7 8
}
