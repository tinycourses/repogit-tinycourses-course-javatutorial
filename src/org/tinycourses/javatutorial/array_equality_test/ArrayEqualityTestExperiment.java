package org.tinycourses.javatutorial.array_equality_test;

import java.util.ArrayList;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Creation time: 2015-26-09T19:26:56:-0800
 * Web site: http://tinycourses.org
 */

public class ArrayEqualityTestExperiment {
    public static final int[] a1 = {1, 2, 3};
    public static final int[] a2 = {1, 2, 3};

    public static void main(String[] args) {
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);


        /**
         * There is no way to test the equality of two arrays without explicitly
         * testing the equality of all of the pairs of corresponding elements.
         * But the classes such as ArrayList, HashMap, etc. have equals() method
         * that can test object equality via obj1.equals(obj2).
         */
        if (a1 == a2) {
            System.out.println("a1 == a2 is true.");
        } else {
            System.out.println("a1 == a2 is false.");
        }

        ArrayList<Integer> l1 = new ArrayList<Integer>(a1.length);
        ArrayList<Integer> l2 = new ArrayList<Integer>(a2.length);

        for (int i : a1) {
            l1.add(i);
        }

        for (int i : a2) {
            l2.add(i);
        }

        if (l1.equals(l2)) {
            System.out.println("l1.equals(l2) is true.");
        } else {
            System.out.println("l1.equals(l2) is false.");
        }
    }

}
