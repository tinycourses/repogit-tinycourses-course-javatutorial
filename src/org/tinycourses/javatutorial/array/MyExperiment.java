package org.tinycourses.javatutorial.array;

/**
 * Created by TinyCourses on 10/12/15.
 */
public class MyExperiment {
    public static int[] intArray = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
