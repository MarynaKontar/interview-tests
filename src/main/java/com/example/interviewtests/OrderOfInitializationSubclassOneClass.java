package com.example.interviewtests;

public class OrderOfInitializationSubclassOneClass extends OrderOfInitializationParentClass {
    private String fieldOne1;
    private String fieldOne2;
    private static String staticFieldOne;

    public OrderOfInitializationSubclassOneClass(String field1, String field2, String fieldOne1, String fieldOne2) {
        super(field1, field2);
        this.fieldOne1 = fieldOne1;
        this.fieldOne2 = fieldOne2;
        System.out.println("SubclassOne constructor");
    }



    static {
        System.out.println("SubclassOne static block");
        staticFieldOne = "SubclassOneStaticFieldOne";
        staticField = "SubclassOneStaticFieldINONE";
    }

    {
        System.out.println("Subclass One instance block" + fieldOne1 + fieldOne2);
    }



    public OrderOfInitializationSubclassOneClass(String field1, String field2) {
        super(field1, field2);
        System.out.println("SubclassOne constructor FINISHED");
    }

    public OrderOfInitializationSubclassOneClass() {
//        super();
        System.out.println("empty SubclasOne constructor ");
    }
}
