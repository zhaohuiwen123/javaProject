package com.bite.com;

public class MainClass {
    public static void main(String[] args) {
        long  start = System.currentTimeMillis();
        int num = 1;
        func(num);
        System.out.println("num = " + num);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void func(int x) {
        System.out.println(x);
        x = 10;
        System.out.println("x = " + x);
    }
}
