package org.tinycourses.javatutorial.number_literal;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 11/18/15T3:57 PM
 */
public class ExperimentNumberLiteral {
    public static int int_decimal = 123;
    public static int int_octal = 0123;
    public static int int_hexadecimal = 0xa23;

    public static void main(String[] args) {
        System.out.println("int_decimal = " + int_decimal);
        System.out.println("int_octal = " + int_octal);
        System.out.println("int_hexadecimal = " + int_hexadecimal);

        /**
         * Convert octals and hexadecimals to literal string.
         */
        System.out.println("Integer.toOctalString(int_octal) = " +
                Integer.toOctalString(int_octal));
        System.out.println("Integer.toHexString(int_hexadecimal) = " +
                Integer.toHexString(int_hexadecimal));

        /**
         * Suffix 'f' and 'd' for real numbers
         */
        System.out.println("real number of float type: " + 1.23f + ", " +
            + .23f + ", " + 0f + ", " + 1e3f + ", " + 1e-3f + ", " + 6.02e+23f);
        System.out.println("real number of float type: " + 1.23 + ", " +
            + .23 + ", " + 0d + ", " + 1e3 + ", " + 1e-3 + ", " + 6.02e+23);

    }

}
