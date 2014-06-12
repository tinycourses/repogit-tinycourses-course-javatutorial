package org.tinycourses.javatutorial.stringbuffer;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 6/4/14 5:35 PM
 */
public class StringBufferExperiment {

    public static void main(String[] args) {
        String s = "FooBar";

        /* sb should be an empty initilaized in the following way. */
        StringBuffer sb = new StringBuffer(10);
        System.out.println("sb = \"" + sb + "\"");

        /* Causes error java.lang.StringIndexOutOfBoundsException: start > length() */
//        sb.replace(2, 3, s);

        /* If sb is empty, i.e. has length 0, the following effectively inserts the whole s into sb at index 0, i.e. the first character. */
        sb = new StringBuffer(10);
        sb.replace(0, 0, s);
        System.out.println("sb = \"" + sb + "\"");

        /* If sb is empty, i.e. has length 0, the following also effectively copies s into sb. */
        sb = new StringBuffer(10);
        sb.replace(0, 2, s);
        System.out.println("sb = \"" + sb + "\"");

        /* If sb is empty, i.e. has length 0, the following also effectively copies s into sb. */
        sb.replace(0, 2, s);
        System.out.println("sb = \"" + sb + "\"");
    }

}
