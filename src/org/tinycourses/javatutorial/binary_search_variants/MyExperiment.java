package org.tinycourses.javatutorial.binary_search_variants;


/**
 * Created with IntelliJ IDEA.
 * User: meng
 * Date: 3/17/14
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;


public class MyExperiment {

    private final static int[] ARRAY = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

    static int binarySearchNonRecursive(int[] a, int key){

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {

            int mid = (low + high) >>> 1;

            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

         return -1;

    }

    static int binarySearchRecursive(int[] a, int key){

        int mid = a.length >>> 1;

        if (a[mid] < key) {
            binarySearchRecursive(copyOfRange(a, mid + 1, a.length), key);
        } else if (a[mid] > key) {
            binarySearchRecursive(copyOfRange(a, 0, mid - 1), key);
        } else {
            return mid;
        }

        return -1;

    }

    private static int targetKey = 13;

    public static void main(String[] args) {
        System.out.println("binarySearch1(): " + binarySearchNonRecursive(ARRAY, targetKey));
        System.out.println("binarySearch2(): " + binarySearchRecursive(ARRAY, targetKey));
        System.out.println("java.util.Arrays.binarySearch(): " + Arrays.binarySearch(ARRAY, targetKey));
    }
}

