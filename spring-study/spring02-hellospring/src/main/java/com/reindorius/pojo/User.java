package com.reindorius.pojo;

public class User {
    private int data1;
    private double data2;
    private String data3;

    public User() {
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public User(int data1, double data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        System.out.println("The instance constructor is called.");
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return "data1 - " + data1 + " | " + "data2 - " + data2 + "\n\tdata3 - " + data3;
    }
}
