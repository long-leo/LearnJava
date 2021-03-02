package com.onjava8.example1;

/**
 * 在一个主类的主方法中调用另一个类中的main方法
 * @author coderliaolong@outlook.com
 * @date 2021/3/2 16:00
 */

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
    }
}

