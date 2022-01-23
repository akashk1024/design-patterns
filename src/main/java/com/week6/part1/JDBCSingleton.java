package com.week6.part1;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton() {

    }

    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            synchronized (JDBCSingleton.class) {
                if (jdbc == null) {
                    jdbc = new JDBCSingleton();
                }
            }
        }
        return jdbc;
    }
}
