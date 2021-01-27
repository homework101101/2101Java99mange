package com.daniu101.chapter10.hw1;

/*
封装一个人类，其属性有姓名、身高、年龄，吃饭和跑步行为，
使用关键字private保护身高和年龄在合适的范围内，并
建立测试类进行测试。
然后重写toString方法，输出类似10.1.5的第一个toString例子。

 */
public class Persion {

    String name;
    private double height;
    private int age;

    public void setHeight(double height) {
        if (height < 0 ){
            System.out.println("人的身高不能小于0");
        }else {
            this.height = height;
        }

    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("人的年龄不能小于0");
        }else {
            this.age = age;
        }

    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    void eat(){
        System.out.println("吃饭的代码");
    }

    void run(){
        System.out.println("吃饭的代码");
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
