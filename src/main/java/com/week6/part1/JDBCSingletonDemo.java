package com.week6.part1;

public class JDBCSingletonDemo {
    public static void main(String[] args) {
        JDBCSingleton jdbcSingleton1 = JDBCSingleton.getInstance();
        JDBCSingleton jdbcSingleton2 = JDBCSingleton.getInstance();
        System.out.println(jdbcSingleton1 == jdbcSingleton2);
    }
}
