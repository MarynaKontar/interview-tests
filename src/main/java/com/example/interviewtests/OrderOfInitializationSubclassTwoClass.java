package com.example.interviewtests;

public class OrderOfInitializationSubclassTwoClass extends OrderOfInitializationParentClass {
    private String fieldTwo1;
    private String fieldTwo2;
    private static String staticFieldTwo;

    public OrderOfInitializationSubclassTwoClass(String field1, String field2, String fieldTwo1, String fieldTwo2) {
        super(field1, field2);
        this.fieldTwo1 = fieldTwo1;
        this.fieldTwo2 = fieldTwo2;
        System.out.println("SubclassTwo constructor");
    }



    static {
        System.out.println("SubclassTwo static block");
        staticFieldTwo = "SubclassTwoStaticFieldTwo";
        staticField = "SubclassTwoStaticFieldINONE";
    }

    {
        System.out.println("SubclassTwo instance block" + fieldTwo1 + fieldTwo2);
    }



    public OrderOfInitializationSubclassTwoClass(String field1, String field2) {
        super(field1, field2);
        System.out.println("SubclassTwo constructor");
    }

    public OrderOfInitializationSubclassTwoClass() {
//        super();
        System.out.println("empty SubclassTwo constructor ");
    }
}
