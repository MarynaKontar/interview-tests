package com.example.interviewtests;

import java.util.Arrays;

public class HeapStackReferenceTest {

    static int x = 0;
    static int arr[] = {77,88};
    public static void main(String[] args) {
        x = f(x, g(x, arr));
        System.out.println("x: " + x); // 42

        System.out.println("arr: " + Arrays.toString(arr));
    }

    // пам`ять у стеку під g() витирається та виділяється пам'ять під f(), в f() передається  х=0 та посиланя на [60],
    // значення 60 міняється на 40, при виході з f() пам'ять в стекі витирається і посилання на [40] також
    private static int f(int x, int[] g) {
        System.out.println("в f() передається посилання на: " + Arrays.toString(g));
        x += 30;
        g[0] = 40;
        System.out.println("f(): значення g[0] змінюється на :" + Arrays.toString(g));
        System.out.println("f(): arr:" + Arrays.toString(arr));
        return 42;
    }

    // під g() виділяється пам'ять у стеку, х міняємо на 50, arr більше не посилається на [77, 88], а посилається на [60]
    // (тому що створили нову матрицю new int[] {60}) та return посилання на [60].
    private static int[] g(int x, int[] arr) {
        x = 50; // жодним чином не змінює глобальрну змінну х, оскільки в метод передається значення, а не посилання
//        arr[0] = 5559595; // оскільки це все ще стара матриця, то змінюється значення і у гдобальної змінної (arr: {5559595, 88})
        arr = new int[] {60};
        System.out.println("g(): arrr:" + Arrays.toString(arr));
        System.out.println("g(): arr:" + Arrays.toString(HeapStackReferenceTest.arr));
        return arr;
    }
}


// Теж саме, але замість int - Integer. Виходить теж саме.
//    static int x = 0;
//    static Integer arr[] = {77,88};
//    public static void main(String[] args) {
//        x = f(x, g(x, arr));
//        System.out.println("x: " + x); // 42
//
//        System.out.println("arr: " + Arrays.toString(arr));
//    }
//
//    // памєять в стекі під g() витерається та виділяється пам'ять під f(), в f() передається  х=0 та посиланя на [60],
//    // значення 60 міняється на 40, при виході з f() пам'ять в стекі витирається і посилання на [40] також
//    private static int f(int x, Integer[] g) {
//        System.out.println("в f() передається посилання на: " + Arrays.toString(g));
//        x += 30;
//        g[0] = 40;
//        System.out.println("f(): значення g[0] змінюється на " + Arrays.toString(g));
//        System.out.println("f(): arr:" + Arrays.toString(arr));
//        return 42;
//    }
//
//    // під g() виділяється пам'ять у стеку, х міняємо на 50, arr більше не посилається на [77, 88], а посилається на [60]
//    // (тому що створили нову матрицю new int[] {60}) та return посилання на [60].
//    private static Integer[] g(int x, Integer[] arr) {
//        x = 50; // жодним чином не змінює глобальрну змінну х, оскільки в метод передається значення, а не посилання
//        arr = new Integer[] {60};
////        arr[0] = 5559595;
//        System.out.println("g(): arrr:" + Arrays.toString(arr));
//        System.out.println("g(): arr:" + Arrays.toString(HeapStackReferenceTest.arr));
//        return arr;
//    }