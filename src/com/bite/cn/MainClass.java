package com.bite.cn;

public class MainClass {

    public static void main(String[] args) {
 //     Student stu = new Student();
//      stu.printName();
//      Student.age = 18;
//     System.out.println(
//                "人类的姓名 = "
//                +stu.name);
//        System.out.println("学生的年龄："+ Student.age);
//        System.out.println("学生的年龄 ：" +Student.studentAge());
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//
//        System.out.println(Person.count);
//        System.out.println(person.SIZE);
//        System.out.println(Person.COUNT);
//        Person.staticTest();
//        //总结：所有被static所修饰的方法或者属性，全部不依赖于对象。
//        person.eat();
//        person.sleep();
        Teacher teacher = new Teacher("a");
        teacher.item = "java";
        System.out.println(teacher.item);

    }

}
