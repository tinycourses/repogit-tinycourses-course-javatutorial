package org.tinycourses.javatutorial.staticmember;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 6/11/14 9:53 PM
 */
public class StaticMemberExperiment {

    public static void main(String[] args) {

        T t1 = new T();

        t1.set_m(1);
        t1.set_m_static(2);

        t1.print_m();
        t1.print_m_static();



        T t2 = new T();

        t2.set_m(1);

        /**
         * Remark:
         *
         * Set value for static member m_static by directly assigning value instead of using the setter method
         * set_m_static.
         */
        T.m_static=2;

        t2.print_m();
        t2.print_m_static();
    }

}
