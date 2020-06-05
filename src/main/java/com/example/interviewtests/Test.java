package com.example.interviewtests;

import java.io.Reader;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

class Example extends Exception {}
 public class Test {
//static String message;
public static void main(String[] args) {

   LocalDate day = LocalDate.of(2020, Month.FEBRUARY, 27);
    System.out.println(day.plusDays(2)); // 2020-02-29
    System.out.println(day.plusDays(3)); // 2020-03-01
    System.out.println(day);             // 2020-02-27

}
//class A{}
//    enum Season extends A{
//    SPRING;
//    }

}
