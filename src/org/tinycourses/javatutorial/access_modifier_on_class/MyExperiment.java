package org.tinycourses.javatutorial.access_modifier_on_class;

import org.tinycourses.javatutorial.access_modifier_on_class.package1.MyClass;
import org.tinycourses.javatutorial.access_modifier_on_class.package2.subpackage.MySubpackageClass;

/**
 * Created with IntelliJ IDEA.
 * Author: Tony Crusoe <tinyCourses@gmail.com>404
 * Date: 3/12/14
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyExperiment {
    public static void main (String[] args){
        MyClass myclass = new MyClass();
        MySubpackageClass mySubpackageClass = new MySubpackageClass();
        System.out.println("MyExperiment done");
    }
}
