package com.bite.cn;

public class Student {
   //【修饰符】类型  变量名 【=默认值】
    public String name ;
    public String sex = "female";
    public static int  age ;
    //【修饰符】返回值类型 方法名【（参数列表）{}】
    public void printName(){
        System.out.println("学生的性别 ： " + sex);
    }
//静态方法的的定义：【修饰符】 static 返回值类型 方法名 【（参数列表）{}】
    public static int  studentAge (){
        return age;
    }


}
