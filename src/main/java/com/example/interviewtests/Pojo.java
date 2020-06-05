package com.example.interviewtests;

public class Pojo {

    private String fieldOne;
    private Integer int1;
    private OrderOfInitializationSubclassOneClass sub1;

    public Pojo(Integer int1) {
        this.int1 = int1;
    }

    public Pojo(String fieldOne, Integer int1, OrderOfInitializationSubclassOneClass sub1) {
        this.fieldOne = fieldOne;
        this.int1 = int1;
        this.sub1 = sub1;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    public OrderOfInitializationSubclassOneClass getSub1() {
        return sub1;
    }

    public void setSub1(OrderOfInitializationSubclassOneClass sub1) {
        this.sub1 = sub1;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Pojo pojo = (Pojo) o;
//
//        if (fieldOne != null ? !fieldOne.equals(pojo.fieldOne) : pojo.fieldOne != null) return false;
//        return int1 != null ? int1.equals(pojo.int1) : pojo.int1 == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = fieldOne != null ? fieldOne.hashCode() : 0;
//        result = 31 * result + (int1 != null ? int1.hashCode() : 0);
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pojo)) return false;

        Pojo pojo = (Pojo) o;

        if (!fieldOne.equals(pojo.fieldOne)) return false;
        if (!int1.equals(pojo.int1)) return false;
        return sub1.equals(pojo.sub1);
    }

    @Override
    public int hashCode() {
        int result = fieldOne.hashCode();
        result = 31 * result + int1.hashCode();
        result = 31 * result + sub1.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "fieldOne='" + fieldOne + '\'' +
                ", int1=" + int1 +
                ", sub1=" + sub1 +
                '}';
    }
}
