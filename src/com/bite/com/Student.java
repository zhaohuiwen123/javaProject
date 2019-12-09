package com.bite.com;

public class Student {
    public String name ="zhaohuiwen";
    public String  sex = "female";
    public int age = 18;
    public Person  person =new Person();
    public static String IdNum;
    public static int xuehao =0;

  public void schoolName(){
      System.out.println("陕西科技大学");
  }
  public static int  count(){

      return ++xuehao;
  }
}
