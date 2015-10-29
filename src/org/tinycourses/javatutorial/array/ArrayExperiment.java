package org.tinycourses.javatutorial.array;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 2015-10-12
 * Time: 12:02 PM
 * Web site: http://tinycourses.org
 */


public class ArrayExperiment {
    private static int[] intArray = new int[10];
    private static int len;

    public static final String NAME="xxx";

    public static void main(String[] args) {

        /**
         * Experiment: array index starts from 0.
         */
        System.out.println("intArray[i] array index i ranges from 0 to intArray.length-1: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "]: " + intArray[i]);
        }

        /**
         * Experiment: Order of operation for intArray[len++], intArray[--len]
         */
        System.out.println("intArray[len++] increments len after evaluating intArray[len]: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        len = 1;
        intArray[len++] = 999;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "]: " + intArray[i]);
        }

        System.out.println("intArray[++len] increments len before evaluating intArray[len]: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        len = 1;
        intArray[++len] = 999;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "]: " + intArray[i]);
        }




    }

}
