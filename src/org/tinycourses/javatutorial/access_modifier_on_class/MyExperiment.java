package org.tinycourses.javatutorial.access_modifier_on_class;

import org.tinycourses.javatutorial.access_modifier_on_class.package1.MyClass;
import org.tinycourses.javatutorial.access_modifier_on_class.package2.subpackage.MySubpackageClass;

/**
 * Author: Tony Crusoe <tinyCourses@gmail.com>404
 * Date: 2014-03-12T18:10-0700
 */
public class MyExperiment {
    public static void main (String[] args){
        MyClass myclass = new MyClass();
        MySubpackageClass mySubpackageClass = new MySubpackageClass();
        System.out.println("ArrayExperiment done");
    }
}
