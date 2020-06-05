package com.example.interviewtests;

public class OrderOfInitializationParentClass {
    private String field1;
    private String field2;
    protected static String staticField;

    public OrderOfInitializationParentClass() {
        System.out.println("empty parent constructor ");
    }

    public OrderOfInitializationParentClass(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
        System.out.println("parent constructor" + field1 + field2);
    }


    static {
        System.out.println("Parent static block");
        staticField = "ParentStaticField";
    }

    {
        System.out.println("Parent instance block" + field1 + field2);
    }


}
