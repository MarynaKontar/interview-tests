package com.example.interviewtests;


public class HeapStackReferenceTestForObjects {
    static int x = 0;
    static Integer arr = 2880;
    static Pojo pojo = new Pojo(6060);
//    static Integer i = new Integer(10);
//    static Integer j = new Integer(20);

    public static void main(String[] args) {
        x = f(x, g(x, arr, pojo), pojo);
        System.out.println("x: " + x); // 42

        System.out.println("arr: " + arr);
        System.out.println("pojo: " + pojo);
    }

    private static int f(int x, Integer arr, Pojo pojo) {
        System.out.println("в f() передається посилання на: " + pojo);
        System.out.println("f(): pojo:" + HeapStackReferenceTestForObjects.pojo);
        x += 30;
        arr = 5689; // arr тепер посилається на іншу ячейку пам'яті, але це посилання зітреться після виходу з методу
        pojo.setInt1(4000);
//        pojo.setFieldOne("dfgdgggerr");
        System.out.println("f(): значення pojo змінюється на " + pojo.toString());
        System.out.println("f(): arr:" + arr);
        System.out.println("f(): pojo:" + pojo);
        System.out.println("f(): pojo:" + HeapStackReferenceTestForObjects.pojo);
        return 42;
    }

    private static Integer g(int x, Integer arr, Pojo pojo) {
        x = 50; // жодним чином не змінює глобальрну змінну х, оскільки в метод передається значення, а не посилання
        arr = new Integer(6000);
//        arr[0] = 5559595;
        pojo.setInt1(4444);
        pojo.setFieldOne("DDDDDDD");
        System.out.println("g(): arrr:" + arr);
        System.out.println("g(): arr:" + HeapStackReferenceTestForObjects.arr);
        System.out.println("g(): pojo:" + pojo);
        System.out.println("g(): pojo:" + HeapStackReferenceTestForObjects.pojo);
        return arr;
    }




//    static void swap(Integer i, Integer j)
//    {
//        Integer temp = new Integer(i);
//        i = j;
//        j = temp;
//        System.out.println(j);
//    }
//    public static void main(String[] args)
//    {
//        // swap() doesn't swap i and j because all changes on i and j in swap doesn't saved
//        swap(i, j);
//        System.out.println("i = " + i + ", j = " + j);
//    }
}
