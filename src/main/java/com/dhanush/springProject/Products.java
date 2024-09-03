package com.dhanush.springProject;

public class Products
{
    private int num;
    private String name;

    @Override
    public String toString() {
        return
                "{num=" + num +
                ", name='" + name  +
                "'}";
    }

    Products(int num, String name) {
        this.name = name;
        this.num = num;
        System.out.println("hiii  iaM IN Products");
    }


}
