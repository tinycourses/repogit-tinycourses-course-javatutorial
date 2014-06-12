package org.tinycourses.javatutorial.org.tinycourses.javatutorial.staticmember;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 6/11/14 9:55 PM
 */
public class T {
    int m;
    static int m_static;

    public void set_m(int m) {
        this.m = m;
    }

    public void set_m_static(int m_static) {
        this.m_static = m_static;
    }

    public void print_m() {
        System.out.println("m = " + m);
    }

    public void print_m_static() {
        System.out.println("m_static = " + m_static);
    }
}
