package com.example.interviewtests;

import java.util.Arrays;

public class StackTest {

    // int[] arr - это обыект (на него есть ссылка)
    // В функции передаются копии примитивных типов и ссылки на объекты.
    // (*) Если в методе поменяли значение объекта (но не ссылку на него),
    // то и при выходе из метода (даже если не возвращаем объект), то значение обыекта поменяется.
    // (**)    Если же в методе поменяли ссылку на объект, то единственный шанс получить эти изменения - вернуть их из функции (return)
    // - иначе при выходе из метода новая ссылка стирается (информация из стека стирается) и остается стаорая ссылка на объект и те значения,
    // которые меняли по старой ссылке.
    public static void main(String[] args) {
        int x = 0;
        int[] arr = {20};

        x = f(x, arr); // (*)

        System.out.println(x);
        System.out.println(Arrays.toString(arr));


        x = f(x, g(x, arr));
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
    }

    private static int f(int x, int[] arr) {
        System.out.println(Arrays.toString(arr)); //[60]
        x+=30;

        arr[0] = 56; // (*)    42, [56]

        arr = new int[] {14, 44, 68}; // (**)     42, [56], то есть новая ссылка стирается, если ее не вернуть из метода (return arr)
        arr[0] = 40; // (**)     42, [56], то есть новая ссылка стирается, если ее не вернуть из метода (return arr)

        return 42;
    }

    private static int[] g(int x, int[] arr) {
        x = 50;
        arr = new int[] {60};
        return arr;
    }
}
