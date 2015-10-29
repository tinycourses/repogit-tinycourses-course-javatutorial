package org.tinycourses.javatutorial.unicode_in_identifiers;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 2015-10-28T22:11-0700
 */
public class UnicodeInIdentifiersExperiment {
    public static String 属性 = "属性值";

    private static 我的类1 我对象1 = new 我的类1();

    public static void 我的方法() {
        System.out.println("我的类1.我的方法() is called.");
    }

    public static void main(String[] args) {
        System.out.println("我对象1.getClass().getName() = " +
                我对象1.getClass().getName());

        System.out.println("属性 = " +  属性);

        我的方法();
    }
}
