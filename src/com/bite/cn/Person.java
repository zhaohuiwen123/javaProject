package com.bite.cn;

public class Person {
    public String sex; //普通变量
    public String name;
    public int age;
    public static int count ;//静态变量
    public final int SIZE = 10;//被final修饰的常量，也属于对象，被final修饰的属性后续不可更改
    public static final int COUNT = 99;//静态常量，属于类本身，只有一份，被修饰后续不可以进行更改
    //实例成员函数
    public void eat(){
        int a = 10;//局部变量，存储在栈区
        System.out.println("eating");
    }
    //实例成员函数
    public void sleep(){
        System.out.println("sleep()!");
    }
    public static void staticTest(){
        //age = 12; static 方法中是不允许访问非静态变量的
        System.out.println("这个是静态方法");
    }
}
