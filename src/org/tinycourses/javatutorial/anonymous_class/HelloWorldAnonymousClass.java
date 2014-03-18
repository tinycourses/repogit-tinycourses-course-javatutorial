package org.tinycourses.javatutorial.anonymous_class;

/**
 * Created with IntelliJ IDEA.
 * User: TinyCourses
 * Date: 2/23/14
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldAnonymousClass {

    public interface HelloWorld {
        public void greet();
    }

    public void sayHello(){


        /**
         * Declare a local class EnglishHelloWorld, and instantiates an object of it.
         */
        class EnglishHelloWorld implements HelloWorld {
            String name = "world!";

            public void greet(){
                System.out.println("Hello" + " " + name);
            }
        }

        HelloWorld englishHelloWorld = new EnglishHelloWorld();


        /**
         * Use anonymous class to declare and instantiate a local class japaneseHelloWorld
         */
        HelloWorld japaneseHelloWorld = new HelloWorld () {
            public void greet(){
                System.out.println("こんにちは世界!");
            }
        };

        englishHelloWorld.greet();

        japaneseHelloWorld.greet();
    }


    public static void main(String[] args) {
        HelloWorldAnonymousClass myApp = new HelloWorldAnonymousClass();
        myApp.sayHello();
    }
}

