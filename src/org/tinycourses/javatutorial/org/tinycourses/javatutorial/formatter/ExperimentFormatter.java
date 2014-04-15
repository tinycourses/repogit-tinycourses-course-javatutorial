package org.tinycourses.javatutorial.org.tinycourses.javatutorial.formatter;


import java.util.GregorianCalendar;

/**
 * Experiment with java.util.Formatter and String.format() method.
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 4/14/14 5:07 PM
 *
 */
public class ExperimentFormatter {

    public static void main(String[] args) {


        /**
         *
         * Related Java documentation:
         * http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
         *
         * Format a number in a string using the following specifications:
         * 1$: uses first argument after the template string, i.e. the second argument of String.format()
         * 0: use '0' for padding
         * ,: use locale-specific grouping separators
         * 15: specify that the width of the formatted string to 15
         * .2: specify that uses 2 digits after decimal place
         * f: converts the value as a floating point numeric
         */
        System.out.println(String.format("This is an integer: %1$0,15.2f", 1234.5678));


        /**
         * Format a date in a string using the following specifications:
         * 1$: uses first argument after the template string, i.e. the second argument of String.format()
         * t: prefix for date
         * m: month
         * e: day of month
         * Y: year
         */
        System.out.println(String.format("Duke's Birthday: %1$tm %1$te,%1$tY", new GregorianCalendar()));

    }

}
