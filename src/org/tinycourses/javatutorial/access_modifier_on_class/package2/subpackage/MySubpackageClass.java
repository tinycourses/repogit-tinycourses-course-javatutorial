package org.tinycourses.javatutorial.access_modifier_on_class.package2.subpackage;

/**
 * Created with IntelliJ IDEA.
 * Author: Tony Crusoe <tinyCourses@gmail.com>
 * Date: 3/12/14
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * The access modifier `public` on the class MySubpackageClass is necessary. If missing the class can be seen only
 * within its own container package org.tinycourses.javatutorial.experiment.access_modifier_on_class.package2.subpackage, and its
 * constructor cannot be invoked from outside of the package.
 */
public class MySubpackageClass {
    public MySubpackageClass() {System.out.println("MySubpackageClass object created!");}
}
