package org.tinycourses.javatutorial.jaggedarray;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 6/5/14 11:08 AM
 */
public class JaggedArrayExperiment {

    public static void main(String[] args) {

        /* Note that using int[] as declared type causes a compilation error. */
        int[][] jagged_array = {{1, 2}, {3, 4, 5}};

        System.out.println("String.valueOf(jagged_array) = " + String.valueOf(jagged_array));

        for (int i = 0; i < jagged_array.length; i++) {

            for (int j = 0; j < jagged_array[i].length; j++) {

                System.out.println("jagged_array[" + i + "][" + j + "] = " + jagged_array[i][j]);
                
            }
        }

        System.out.println("Experiment 2: assign value to elements of jagged array after declaration:");

        /* Declare jagged array and specifies the size first. */
        jagged_array = new int[3][2];

        /*

        Note it is also illegal to declare a variable first and assign value separately like the following

            int[] v = new int[2];
            v = {1, 2};

        Therefore, for jagged arrays, it's illegal to assign value as the following.  It causes a compilation error
        "illegal start of expression"

        */
//        jagged_array_2[0] = {1, 3};


        /*

        However, one can declare an array and assign value to it at the same time, sort of like anonymous class (see
        http://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html).

            int[] v = new int[]{1,2};

        but

            int[] v = new int[2]{1, 2};

        is incorrect.

        */

        jagged_array[0] = new int[]{1,3};

        for (int i = 0; i < jagged_array.length; i++) {

            for (int j = 0; j < jagged_array[i].length; j++) {

                System.out.println("jagged_array[" + i + "][" + j + "] = " + jagged_array[i][j]);

            }
        }


    }

}
