package org.tinycourses.javatutorial.stringbuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 10/28/15
 * Time: 4:45 PM
 */
public class StringBuilderExperiment {

    private static StringBuilder sb1 = new StringBuilder();
    private static StringBuilder sb2 = new StringBuilder(100);
    private static String S = "foobarfoobarfoobarfoobarfoobar";

    public static void main(String[] args) {

        /**
         * StringBuilder initialized has length zero and looks like empty string.
         */
        System.out.println("sb1 = \"" + sb1 + "\"");
        System.out.println("sb1.length() = \"" + sb1.length() + "\"");
        System.out.println("sb2 = \"" + sb2 + "\"");
        System.out.println("sb2.length() = \"" + sb2.length() + "\"");
        System.out.println();

        System.out.println("StringBuilder.insert(): ");
        sb1.insert(0, S);
        System.out.println("sb1 = \"" + sb1 + "\"");
        System.out.println("sb1.length() = \"" + sb1.length() + "\"");
        System.out.println();

        /**
         * String.replace(start, end, str).  Note that in the following the value
         * of end is smaller than the length of 'str' but all of 'str' got added
         * to 'sb2' anyway.
         */
        System.out.println("StringBuilder.replace(): ");
        sb2.replace(0, 6, S);
        System.out.println("sb2 = \"" + sb2 + "\"");
        System.out.println("sb2.length() = \"" + sb2.length() + "\"");
        System.out.println();

        /**
         * String.replace(start, end, str).  Note that in the following the value
         * of end is smaller than the length of 'str' but all of 'str' got added
         * to 'sb2' anyway.
         */
        System.out.println("StringBuilder.append(): ");
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date();
        sb2.append(sdf.format(d));
        System.out.println("sb2 = \"" + sb2 + "\"");
        System.out.println("sb2.length() = \"" + sb2.length() + "\"");

    }

}
