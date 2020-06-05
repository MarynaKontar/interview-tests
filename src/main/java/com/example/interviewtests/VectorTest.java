package com.example.interviewtests;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
    public static void main (String[] args)
    {
        Vector<String> vector = new Vector<>();
        Object x = vector.elements();
        System.out.print((x instanceof Enumeration)+",");
        System.out.print((vector.iterator() instanceof Iterator)+",");
        System.out.print(vector.listIterator() instanceof ListIterator);
    }
}


//        Prints: true,false,false
//        Correct Answer: Option D
//        Explanation:
//        The Vector.elements method returns an Enumeration over the elements of the vector.
//        Vector implements the List interface and extends AbstractList so it is also possible to get an Iterator
//        over a Vector by invoking the iterator or listIterator method.