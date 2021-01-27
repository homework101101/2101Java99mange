package com.daniu101.chapter10.hw1;

/*
封装一个人类，其属性有姓名、身高、年龄，吃饭和跑步行为，
使用关键字private保护身高和年龄在合适的范围内，并
建立测试类进行测试。
然后重写toString方法，输出类似10.1.5的第一个toString例子。

 */
public class PersionTest {

    public static void main(String[] args) {

        Persion pe = new Persion();
        pe.setAge(19);
        pe.setHeight(87);

        System.out.println(pe.getAge());
        System.out.println(pe.getHeight());
        System.out.println(pe.toString());
    }

}
