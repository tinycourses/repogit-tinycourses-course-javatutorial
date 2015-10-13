/**
 * Created with IntelliJ IDEA.
 * Author: Tony Crusoe <tinyCourses@gmail.com>404
 * Date: 2/21/14
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */


package org.tinycourses.javatutorial.classname;

public class ExperimentClassName {

    private static final Integer objInteger = new Integer(1);

    private static final int objInt = 1;

    public static void main (String[] args) {


        /**
         * Get fully qualified class name including context of an object.
         *
         */
        System.out.println("The class of object " + objInteger + " is " +  objInteger.getClass().getName());

        // a different method using the class attribute
        System.out.println("The class of object " + objInteger + " is " +  Integer.class.getName());

        // Java primitive types: int, short, long, float, double, char, byte, boolean, and keyword void
        // Note that int.getClass.getName() does not work.
        System.out.println("The class of Java primitive type int is " +  int.class.getName());
        System.out.println("The class of Java primitive type short is " +  short.class.getName());
        System.out.println("The class of Java primitive type long is " +  long.class.getName());
        System.out.println("The class of Java primitive type float is " +  float.class.getName());
        System.out.println("The class of Java primitive type double is " +  double.class.getName());
        System.out.println("The class of Java primitive type char is " +  char.class.getName());
        System.out.println("The class of Java primitive type byte is " +  byte.class.getName());
        System.out.println("The class of Java primitive type boolean is " +  boolean.class.getName());

        // Question: What's the difference between int and java.lang.Integer?
        System.out.println("The class of Java primitive type int is " +  objInteger.getClass());

    }

}
